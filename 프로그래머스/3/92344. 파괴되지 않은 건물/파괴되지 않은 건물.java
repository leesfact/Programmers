class Solution {
    public int solution(int[][] board, int[][] skill) {
        int N = board.length;
        int M = board[0].length;
        
        int[][] prefixSum = new int[N+1][M+1];
        
        for(int[] sk : skill) {
        	int type = sk[0];
        	int r1 = sk[1];
        	int c1 = sk[2];
        	int r2 = sk[3];
        	int c2 = sk[4];
        	int degree = (type == 1) ? -sk[5] : sk[5];
        	
        	prefixSum[r1][c1] += degree;
            prefixSum[r1][c2+1] -= degree;
            prefixSum[r2+1][c1] -= degree;
            prefixSum[r2+1][c2+1] += degree;
        }
        
    
        
        for (int i = 0; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                prefixSum[i][j] += prefixSum[i][j-1];
            }
        }

       
        for (int j = 0; j <= M; j++) {
            for (int i = 1; i <= N; i++) {
                prefixSum[i][j] += prefixSum[i-1][j];
            }
        }
		
		
        
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                board[i][j] += prefixSum[i][j];
                if (board[i][j] > 0) count++;
            }
        }
        
        
       
        
        return count;
    }
}