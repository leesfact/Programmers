class Solution {
    int MOD = 20170805;
    public int solution(int m, int n, int[][] cityMap) {
        int[][] right = new int[m + 1][n + 1];
        int[][] down = new int[m + 1][n + 1];
        
        right[1][1] = 1;
        down[1][1] = 1;
        
        for(int y = 1; y <= m; y++) {
        	for(int x = 1; x <= n; x++) {
        		if(cityMap[y-1][x-1] == 0) {
        			right[y][x] += (right[y][x-1] + down[y-1][x]) % MOD;
        			down[y][x] += (right[y][x-1] + down[y-1][x]) % MOD;
        		}else if(cityMap[y-1][x-1] == 2) {
        			right[y][x] = right[y][x-1];
        			down[y][x] = down[y-1][x];
        		}
        	}
        }
        
        return (right[m][n - 1] + down[m - 1][n]) % MOD;
    }
}