class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x");
        
        if(myString.charAt(myString.length() - 1) == 'x') {
        	String[] newStr = new String[str.length + 1];
        	System.arraycopy(str, 0, newStr, 0, str.length);
        	newStr[newStr.length - 1] = "";
        	str = newStr;
        }
        
        int[] answer = new int[str.length];
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = str[i].length();
        }
        
        return answer;
    }
}