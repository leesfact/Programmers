class Solution {
    public int solution(int n) {
        int answer = 0;
        int cn = 0;
        for(int i = 1; i <= n; i++) {
        	for(int j = 1; j <= i; j++ ) {
        		if(i % j == 0) {
        			cn++;
    		   }
    		}
        	if(cn >= 3) {
        		answer++;
        	}
        	cn = 0;
        }
        return answer;
    }
}
