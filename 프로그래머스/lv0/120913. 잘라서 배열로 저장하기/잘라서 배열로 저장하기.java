import java.util.Arrays;
class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer ;
        int length = my_str.length();
        
		if(my_str.length() % n == 0) {
			answer = new String[my_str.length()/n];
		}else {
			answer = new String[(my_str.length()/n) + 1 ];
		}
		
        for(int i = 0; i < answer.length; i++) {
        	if(length - n < 0) {
        		answer[i] = my_str.substring(n*i, my_str.length());
        	}else {
        		answer[i] = my_str.substring(n*i, n*(i+1));
        		length -=n;
        	}
        }
        return answer;
    }
}