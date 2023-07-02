import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
       
	        List<Integer> arrList = new ArrayList<>();
	        
	        int prevNum = arr[0];
	        arrList.add(prevNum);
	        
	        for(int i = 1; i < arr.length; i++) {
	        	if(prevNum != arr[i]) {
	        		arrList.add(arr[i]);
	        		prevNum = arr[i];
	        	}
	        }
	        
	        int[] answer = new int[arrList.size()];
	        
	        int index = 0;
	        
	        for(Integer a : arrList) {
	        	answer[index++] = a;
	        }
	      
	            	
	        return answer;
    }
}