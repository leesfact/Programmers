import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
         Stack<Integer> stack = new Stack<>();
        int i = 0;
        while(i < arr.length) {
        	
        	if(stack.isEmpty() || stack.peek() != arr[i]) stack.add(arr[i++]);
        	else {
        		stack.pop();
        		i++;
        	}
        	
        	
        }
        if(stack.isEmpty()) return new int[] {-1};
        int[] answer = new int[stack.size()];
        for(int j = 0; j < answer.length; j++) {
        	answer[j] = stack.get(j);
        }
        
        return answer;
    }
}