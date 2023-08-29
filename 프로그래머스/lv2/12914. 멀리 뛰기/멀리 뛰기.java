class Solution {
    public long solution(int n) {
        if(n <= 2) return n;
	       
	       
	       long[] ways = new long[n + 1];
	       
	       ways[1] = 1;
	       ways[2] = 2;
	       
	       for (int i = 3; i <= n; i++) {
	            ways[i] = (ways[i - 1] + ways[i - 2]) % 1234567;
	        }
	       
	       
	       return ways[n];
    }
}