class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        if(myString.contains(pat)) {
        	int a = pat.length() == 1 ? myString.lastIndexOf(pat) + 1 : myString.lastIndexOf(pat) + pat.length();
        	answer = myString.substring(0, a);
        }
        
        return answer;
    }
}