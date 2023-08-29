class Solution {
    private static long[] memo;
	
	
	public static long jumpCase(int n) {
		
		
		if(n <= 2) return n;
		
		
		if (memo[n] != 0) return memo[n];
		
		 memo[n] = (jumpCase(n - 1) + jumpCase(n - 2)) % 1234567;
		 
		
		 return memo[n];
	}
	
	
	
	 public static long solution(int n) {
	       
		 memo = new long[n + 1];
		 
		 
		 
		 
		 return jumpCase(n);
    }
    
}