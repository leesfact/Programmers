import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] parts = myStr.split("[a-c]");
        List<String> result = new ArrayList<>();
        
        for(String part : parts) {
        	if(!part.isEmpty()) {
        		result.add(part);
        	}
        }
        
        String[] newPart = new String[result.size()];
        if(newPart.length == 0) {
        	return new String[] {"EMPTY"};
        }
        for(int i = 0; i < newPart.length; i++) {
        	newPart[i] = result.get(i);
        }
        
        
        
        return newPart;
    }
}