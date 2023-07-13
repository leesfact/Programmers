import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
       Set<Integer> entrySet = new HashSet<>();
	        
	        for(int i = numbers.length -1 ; i >= 0; i--) {
	        	int start = numbers.length - i - 1;	    
	        	for(int j = start + 1; j < numbers.length; j++) {
	        		int temp = numbers[start] + numbers[j];
	        		
	        		entrySet.add(temp);
	        		
	        		
	        	}
	        }
	        int[] answer = new int[entrySet.size()];
	        
	      
	        int cnt = 0;
	        for(Integer a : entrySet) {
	        
	        	answer[cnt++] = a;
	        }
	        
	        Arrays.sort(answer);
	        return answer;
    }
}