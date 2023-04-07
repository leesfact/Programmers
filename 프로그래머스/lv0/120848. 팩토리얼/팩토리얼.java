class Solution {
    public int solution(int n) {
       int answer = 0;
		int[] factor = {1,2,6,24,120,720,5040,40320,362880,3628800};
		
		for(int i = 0; i < 10;  i++) {
			if(factor[i] <= n) {
				answer= i+1;
			}
		}

        return answer;
    }
}