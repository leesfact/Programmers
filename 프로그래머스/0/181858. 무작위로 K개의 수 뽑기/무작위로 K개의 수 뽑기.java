import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
    	Arrays.fill(answer, -1);
    	
    	Set<Integer> set = new LinkedHashSet<>();
    	
    	for(int i = 0; i < arr.length; i++) {
    		set.add(arr[i]);
    	}
    	
    	
    	
    	ArrayList<Integer> list = new ArrayList<>(set);
    	
    	
    	 for (int i = 0; i < k && i < list.size(); i++) {
             answer[i] = list.get(i);
         }
    	
    	
        return answer;
    }
}