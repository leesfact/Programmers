import java.util.*;
class Solution {
    public int solution(String s) {
       int answer = 0;
	    
	    for(int i = 0; i < s.length(); i++) {
	    	
	    	String rotated = s.substring(i) + s.substring(0,i);
	    	Stack<Character> stack = new Stack<>();
	    	boolean valid = true;
	    	
	    	for(char c : rotated.toCharArray()) {
	    		if(c == '(' || c == '[' || c == '{') {
	    			stack.push(c);
	    		} else {
	    			if(stack.isEmpty()) {
	    				valid = false;
	    				break;
	    			}
	    			
	    			char open = stack.pop();  
	    			
	    			if ((c == ')' && open != '(') ||
	                    (c == ']' && open != '[') ||
	                    (c == '}' && open != '{')) {
	                        valid = false;
	                        break;
	                    }
	    			
	    		}
	    	}
	    	
	    	if (valid && stack.isEmpty()) {
	            answer++;
	        }
	    	
	    	
	    }
	    
	    return answer;
    }
}