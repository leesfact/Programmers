class Solution {
    public String solution(int[] food) {
        String answer = "";
	        
	        for(int i = 1; i < food.length; i++) {
	        	int cnt = food[i] / 2 ;
	        	for(int j = 1; j <= cnt; j++) {
	        		answer += i;
	        	}
	        }
	        String reverse = new StringBuilder(answer).reverse().toString();
	        answer += 0 ;
	        answer +=reverse;
	        
	       
	        return answer;
    }
}