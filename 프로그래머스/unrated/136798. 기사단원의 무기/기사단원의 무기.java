class Solution {
    public int solution(int number, int limit, int power) {
         int answer = 0;
        
        for(int i = 1; i <= number; i++) {
        	
        	int divisor = 0;
        	int sqrt = (int)Math.sqrt(i);
        	for(int j = 1; j <= sqrt; j++) {
        		if( i % j == 0) {
        			divisor += (j == i / j) ? 1 : 2;
        		}
        	
        	}
        	if(divisor > limit) {
        		answer += power;
        	} else {
        		answer += divisor;
        	}
        	
        }
       
        
        return answer;
    }
}