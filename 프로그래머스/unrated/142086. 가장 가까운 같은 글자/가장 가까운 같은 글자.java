import java.util.*;
class Solution {
    public int[] solution(String s) {
       int[] result = new int[s.length()];
        int[] lastPosition = new int[26];
        
        Arrays.fill(lastPosition, -1);
        
        for(int i = 0; i < s.length(); i++) {
        	char ch = s.charAt(i);
        	
        	if(lastPosition[ch - 'a'] == -1) {
        		result[i] = -1;
        	}else {
      
        		result[i] = i - lastPosition[ch -'a'];
        	}
        	
        	lastPosition[ch -'a'] = i;
        }
        
       
        return result;
    }
}