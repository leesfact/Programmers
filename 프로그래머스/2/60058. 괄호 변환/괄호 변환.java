import java.util.*;
class Solution {
    
    public static boolean isValid(String v){
        Stack<Character> stack = new Stack<>();
        
        for(char c : v.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else if(c == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            }
        
        }
        return stack.isEmpty();
    }
    
    
    public static String convert(String c){
        if(c.isEmpty()) return "";
		
		int balance = 0;
		int splitPoint = 0;
		
		for(int i = 0; i < c.length(); i++) {
			if(c.charAt(i) == '(') {
				balance++;
			}else {
				balance--;
			}
			
			if(balance == 0) {
				splitPoint = i + 1;
				break;
			}
		}
		
		String u = c.substring(0,splitPoint);
		String v = c.substring(splitPoint);
		
		
		if(isValid(u)) {
			return u + convert(v);
		}else {
			String newString = "(" + convert(v) + ")";
			String flippedU = u.substring(1, u.length() - 1)
							   .replaceAll("\\(", "0")
							   .replaceAll("\\)", "(")
							   .replaceAll("0", ")");
    
			return newString + flippedU;
		}
    }
    public static String solution(String p) {
        String answer = "";
        if(isValid(p)){
            answer = p;
            return answer;
        }
        
        answer = convert(p);
        return answer;
    }
}