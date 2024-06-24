import java.util.*;
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String[] splitStr = my_string.split("");
       
        
        for(int i = 0; i < overwrite_string.length(); i++) {
        	
        	splitStr[i+s] = String.valueOf(overwrite_string.charAt(i));
        }
       
       
        
        return String.join("", splitStr);
    }
}