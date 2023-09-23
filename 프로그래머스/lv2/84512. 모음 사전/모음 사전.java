import java.util.*;
class Solution {
    final static char[] WORDS = {'A','E','I','O','U'};
	final static int MAX_SIZE = 5;
    
    public static int solution(String word) {
        int answer = 0;
        
        ArrayList<String> elements = new ArrayList<>();
        
        for(int i = 0; i < WORDS.length; i++) {
        	if(dfs(elements, String.valueOf(WORDS[i]),word)){
        		break;
        	}
        }
        
        for(int i = 0; i < elements.size(); i++) {
        	if(elements.get(i).equals(word)) {
        		answer = i + 1;
        		break;
        	}
        }
        
        
        return answer;
    }
    
    public static boolean dfs(ArrayList<String> elements, String str, String target) {
		if(str.length() > MAX_SIZE) return false;
		
		if(!elements.contains(str)) {
			elements.add(str);
		}
		
		if(str.equals(target)) {
		    return true;
		}
		
		for(int i = 0; i < WORDS.length; i++) {
			if (dfs(elements, str+WORDS[i], target)) {
			    return true; 
			}
		}
		return false;
	}
}

