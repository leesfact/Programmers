import java.util.*;
class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, Character>mapList = new HashMap<>();
        mapList.put(1, 'w');
        mapList.put(-1, 's');
        mapList.put(10, 'd');
        mapList.put(-10, 'a');

        for(int i = 1; i < numLog.length; i++) {
        	int x = numLog[i] - numLog[i-1];
        	sb.append(mapList.get(x));
        	
        }
        
        return sb.toString();
    }
}