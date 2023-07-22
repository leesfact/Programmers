class Solution {
    public static int solution(int[] nums) {
	       
		 
	        return combination(nums, new boolean[nums.length],0, nums.length, 3);
	 }
	 
	 
	 public static int combination(int[] arr, boolean[] visited, int start, int n, int r) {
		 int cnt = 0;
		 
		 if(r == 0) {
			 return checkPrime(arr, visited, n) ? 1: 0;
		 }
		 
		 for(int i = start; i < n; i++) {
			 visited[i] = true;
			 
			 cnt += combination(arr, visited, i+1, n, r-1);
			 visited[i] = false;
		 }
		 
		 return cnt;
		 
	 }
	 
	 
	 public static boolean checkPrime(int[] arr, boolean[] visited, int n) {
		 
		 int sum = 0;
		 
		 for(int i= 0; i < n; i++) {
			 if(visited[i]) {
				 sum +=arr[i];
			 }
		 }
		 return isPrime(sum);
	 }
	 
	 public static boolean isPrime(int num) {
		 if(num < 2) return false;
		 
		 for(int i = 2; i * i <= num; i++) {
			 
			 if(num % i == 0) {
				 return false;
			 }
		 }
		 
		 return true;
	 }
}