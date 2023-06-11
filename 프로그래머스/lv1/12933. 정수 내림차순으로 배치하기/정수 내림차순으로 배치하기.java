import java.util.*;
class Solution {
    public long solution(long n) {
       long answer = 0;
        String str = "" + n;
        
        char[] chars = str.toCharArray();
        
        Arrays.sort(chars);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i= chars.length-1; i>=0; i--) {
        	sb.append(chars[i]);
        }
        
        answer = Long.parseLong(sb.toString());

      
        return answer;
    }
}