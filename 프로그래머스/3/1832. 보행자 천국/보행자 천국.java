class Solution {
    static int MOD = 20170805;
   
	public static int solution(int m, int n, int[][] cityMap) {
		
		int[][] right = new int[m + 1][n + 1];
        int[][] down = new int[m + 1][n + 1];
        
        right[0][0] = 1;

        
        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                if (cityMap[y][x] == 0) {
                    right[y+1][x] += (right[y][x] + down[y][x]) % MOD;
                    down[y][x+1] += (right[y][x] + down[y][x]) % MOD;
                } else if (cityMap[y][x] == 2) {
                    right[y+1][x] = right[y][x];
                    down[y][x+1] = down[y][x];
                }
                
            }
        }
        
        
        return (right[m-1][n-1] + down[m-1][n-1]) % MOD;
    }
}