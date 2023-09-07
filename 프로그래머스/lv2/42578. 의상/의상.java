import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
         int answer = 1;
	        HashMap<String, ArrayList<String>> clothesMap = new HashMap<>();
	        
	        
	        
	        for(String[] cloth : clothes) {
	        	
	        	String clothName = cloth[0];
	        	String clothType = cloth[1];
	        	
	        	if(!clothesMap.containsKey(clothType)) {
	        		clothesMap.put(clothType, new ArrayList<>());
	        	}
	        	
	        	clothesMap.get(clothType).add(clothName);
	        	
	        }
	        
	        
	        
	        for(ArrayList<String> value : clothesMap.values()) {
	        	answer *= (value.size() + 1);
	        }
	        
	        answer -= 1;
	        
	        
	        return answer;
    }
}