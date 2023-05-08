
import java.util.*;
class Solution {
    public int solution(int[] array) {
         int answer = array[0];
        
        
        if(!(array.length>1)) {
           System.out.println(answer);
           return answer;
        }else {
           Map<Integer, Integer> countMap = new LinkedHashMap<>();
           
           for(Integer number : array) {
              if(countMap.containsKey(number)) {
            	  countMap.put(number, countMap.get(number)+1);
              }else {
            	  countMap.put(number, 1);
              }
           }
           System.out.println(countMap);
        
           int maxCount = 0;
           int maxValue = -1;
           for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
        	   if(entry.getValue() > maxCount) {
        		   // 3,3,3,2,1
        		   maxCount = entry.getValue();
        		   maxValue = entry.getKey();
        	   }
           }
           System.out.println("maxCount: " + maxCount+", " + "maxValue: " + maxValue);
           
           int equalFrequencyCount = 0;
           for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
               if (entry.getValue() == maxCount) {
                   equalFrequencyCount++;
               }
           }

           if (equalFrequencyCount > 1) {
               answer = -1;
           } else {
               answer = maxValue;
           }
           
        }
        
        System.out.println(answer);
        return answer;
    }
}