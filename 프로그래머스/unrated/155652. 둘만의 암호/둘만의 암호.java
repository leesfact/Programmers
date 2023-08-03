import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
	        ArrayList<String> alphabet = new ArrayList<>();
	        
	        for(char c = 'a'; c <= 'z'; c++) {
	        	alphabet.add(String.valueOf(c));
	        }
	        
	        for(char c : skip.toCharArray()) {
	    	   alphabet.remove(String.valueOf(c));
	        }
	        
	        
	        	
        	for(char c : s.toCharArray()) {
        		if(alphabet.contains(String.valueOf(c))) {
        		    int i = alphabet.indexOf(String.valueOf(c));
        		    int targetIndex = (i + index) % alphabet.size();
        		    answer += alphabet.get(targetIndex);
        		}
        	}
	        
	        System.out.println(answer);
	        return answer;
    }
}