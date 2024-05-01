import java.util.*;
class Solution {
    public String[] solution(String myString) {
       String[] temp = myString.split("x",-1);
        ArrayList<String> list = new ArrayList<>();
        
        for(String s : temp) {
        	if(!s.isEmpty()) {
        		list.add(s);
        	}
        }
        
        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        
        return answer;
    }
}