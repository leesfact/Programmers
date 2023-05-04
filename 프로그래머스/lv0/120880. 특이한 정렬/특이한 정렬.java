import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Map<Integer, Integer> map  = new LinkedHashMap<>();
        
        for(int i = 0; i < numlist.length; i++) {
           answer[i] = Math.abs(numlist[i] - n);   
           map.put(numlist[i],answer[i]);
        }
        
        Arrays.sort(answer);
        
        int[] newArray = new int[numlist.length];
        
        int index = 0;
        for (int i = 0; i < answer.length; i++) {
        	List<Integer> sameValueKeys = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == answer[i]) {
                    sameValueKeys.add(entry.getKey());
                }
            }
            
            if(!sameValueKeys.isEmpty()) {
            	Collections.sort(sameValueKeys,Collections.reverseOrder());
            	for(Integer key : sameValueKeys) {
            		newArray[index++] = key;
            		map.remove(key);
            	}
            }
        }
        
        return newArray;
    }
}