class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char[] set = new char[str1.length() + str2.length()];
        int index = 0;
        for(int i = 0; i < set.length; i += 2) {
        	set[i] = str1.charAt(index); 
        	index++;
        }
        index = 0;
        for(int i = 1; i < set.length; i += 2) {
        	set[i] = str2.charAt(index); 
        	index++;
        }
        
        for(int i = 0; i < set.length; i++) {
        	answer += set[i];
        }
        
        return answer;
    }
}