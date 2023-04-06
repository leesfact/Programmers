import java.util.ArrayList;

class Solution {
    public int solution(String before, String after) {
      
        String[] beforeList = before.split("");
        String[] afterList = after.split("");
        ArrayList<String> str = new ArrayList<>();
        
        for(int i = 0; i < before.length(); i++) {
        	str.add(beforeList[i]);
        }
   
        for(int i = 0; i < before.length(); i++) {
        	if(str.contains(afterList[i])) {
        		str.remove(afterList[i]);
        	}
        }
        return str.isEmpty() ? 1 : 0;
    }
}