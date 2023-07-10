import java.util.*;

class Solution {
    public int solution(String s) {
        
        Map<String, String> numList = new HashMap<>();
        numList.put("zero", "0");
        numList.put("one", "1");
        numList.put("two", "2");
        numList.put("three", "3");
        numList.put("four", "4");
        numList.put("five", "5");
        numList.put("six", "6");
        numList.put("seven", "7");
        numList.put("eight", "8");
        numList.put("nine", "9");
        
        
        
        for(Map.Entry<String, String> entry : numList.entrySet()) {
        	s = s.replaceAll(entry.getKey(), entry.getValue());
        }
       
        return Integer.parseInt(s);
    }
}