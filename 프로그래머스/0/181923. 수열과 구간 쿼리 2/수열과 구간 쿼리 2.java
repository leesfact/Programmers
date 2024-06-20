import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int[] query : queries) {
        	int minNum = Integer.MAX_VALUE;
        	boolean found = false;
        	for(int i = query[0]; i <= query[1]; i++) {
        		
        		if(arr[i] > query[2] &&  arr[i] < minNum) {
        			minNum = arr[i];
        			found = true;
        		}
        		
        	}
        	
        	if(found) list.add(minNum);
        	else list.add(-1);
        	
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}