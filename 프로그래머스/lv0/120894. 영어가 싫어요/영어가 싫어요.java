import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
   public static long solution(String numbers) {
		long answer = 0;
		StringBuilder str = new StringBuilder();
		
        Map<String, Integer> strToInt = new LinkedHashMap<>();
        
        strToInt.put("zero", 0);
        strToInt.put("one", 1);
        strToInt.put("two", 2);
        strToInt.put("three", 3);
        strToInt.put("four", 4);
        strToInt.put("five", 5);
        strToInt.put("six", 6);
        strToInt.put("seven", 7);
        strToInt.put("eight", 8);
        strToInt.put("nine", 9);
        
        
        while(!numbers.isEmpty()) {
        for(Map.Entry<String, Integer> entry : strToInt.entrySet()) {
        	if(numbers.startsWith(entry.getKey())) {
        		
        		str.append(entry.getValue());
        		numbers = numbers.substring(entry.getKey().length());
        		break;
        	}
   		  }
        }
        
        answer = Long.parseLong(str.toString());          
        return answer;
    }
}