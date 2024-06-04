class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 0; i <= myString.length() - pat.length(); i++) {
        	String str = myString.substring(i, i+pat.length());
        	if(str.equals(pat)) answer++;
        	
        }
        
        return answer;
    }
}