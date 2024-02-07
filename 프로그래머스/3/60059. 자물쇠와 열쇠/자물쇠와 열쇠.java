class Solution {
    public static int[][] rotate(int[][] matrix){
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] rotated = new int[n][m];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				rotated[j][m - 1 - i] = matrix[i][j];
			}
		}
		
		return rotated;
	}
	
	public static boolean check(int[][] largeLock, int[][] key, int startRow, int startCol) {
	    int N = largeLock.length - (2 * (key.length - 1));
	    int M = key.length;
	    int offset = M - 1;

	    for (int i = 0; i < M; i++) {
	        for (int j = 0; j < M; j++) {
	            largeLock[startRow + i][startCol + j] += key[i][j];
	        }
	    }

	    for (int i = offset; i < offset + N; i++) {
	        for (int j = offset; j < offset + N; j++) {
	            if (largeLock[i][j] != 1) {
	               
	                for (int x = 0; x < M; x++) {
	                    for (int y = 0; y < M; y++) {
	                        largeLock[startRow + x][startCol + y] -= key[x][y];
	                    }
	                }
	                return false;
	            }
	        }
	    }

	    
	    for (int i = 0; i < M; i++) {
	        for (int j = 0; j < M; j++) {
	            largeLock[startRow + i][startCol + j] -= key[i][j];
	        }
	    }

	    return true;
	}
	
	
	
	public static boolean solution(int[][] key, int[][] lock) {
        
		int N = lock.length; 
		int M = key.length;
		int extendedSize = N + 2 * (M-1);
        int[][] largeLock = new int[extendedSize][extendedSize];
        
        for(int i = 0; i < N; i++) {
        	for(int j = 0; j < N; j++) {
        		largeLock[i + M - 1][j + M - 1] = lock[i][j];
        	}
        }
        
       for(int r = 0; r < 4; r++) {
    	   key = rotate(key);
    	   for(int x = 0; x <= extendedSize - M; x++) {
    		   for(int y = 0; y <= extendedSize - M; y++) {
    			   if(check(largeLock, key, x, y)) {
    				   return true;
    			   }
    		   }
    	   }
       
       
       }
       
        return false;
    }
}