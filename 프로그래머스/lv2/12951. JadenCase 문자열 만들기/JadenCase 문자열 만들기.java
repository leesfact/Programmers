class Solution {
    public String solution(String s) {
      StringBuilder answer = new StringBuilder();
	       	
	       	String[] words = s.split(" ", -1);
	       	
	       	for(int i = 0; i < words.length; i++) {
	       		if(words[i].length() > 0) {
	       			char firstChar = words[i].charAt(0);
	       			answer.append(Character.toUpperCase(firstChar));
	       			answer.append(words[i].substring(1).toLowerCase());
	       		}
	       		
	       		if( i < words.length - 1) {
	       			answer.append(" ");
	       		}
	       	}
	       
	        
	        
	        return answer.toString();
    }
}