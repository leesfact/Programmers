import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] % divisor == 0) {
        		list.add(arr[i]);
        	}
        }
        if(list.isEmpty()) {
        	 answer = new int[1];
        	 answer[0] = -1;

        }else {
        	 answer = new int[list.size()];        	
        }
       
        Collections.sort(list);
        
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}