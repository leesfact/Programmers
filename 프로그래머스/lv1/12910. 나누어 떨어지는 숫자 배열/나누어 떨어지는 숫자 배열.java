import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int number : arr) {
        	if(number % divisor == 0) {
        		list.add(number);
        	}
        }
        if(list.isEmpty()) {
        	 return new int[] {-1};
        }
       
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}