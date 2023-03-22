import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
       char ch = 0;
        String intStr = "";
        for(int i = 0; i<my_string.length(); i++) {
        	ch = my_string.charAt(i); 
        	if(ch >= 48 && ch <= 57) {
        	intStr += ch;	
        	}
        }
        int[] answer = new int[intStr.length()];
        for(int i = 0; i < intStr.length(); i++) {
            answer[i] = Character.getNumericValue(intStr.charAt(i)); 
        }
        Arrays.sort(answer);
  
        return answer;
    }
}