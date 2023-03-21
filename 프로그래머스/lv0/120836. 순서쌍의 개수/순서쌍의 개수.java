class Solution {
    public int solution(int n) {
 
        int answer = 0;
        for(int i = 1; i<=n; i++) {
        	if( n % i == 0) {    // 1,2,4,5,10,20
        		answer++;
        	}
        }
        return answer;
    }
}