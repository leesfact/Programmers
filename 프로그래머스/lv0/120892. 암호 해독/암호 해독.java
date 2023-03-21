class Solution {
    public String solution(String cipher, int code) {
       String answer = "";
        String[] letter = cipher.split("");
        
        for(int i = code-1; i<letter.length; i+=code) {
        	 answer += letter[i];
        }
        return answer;
    }
}