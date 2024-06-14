import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        int cnt = 0;
        while (cnt < arr.length) {
        	if(stack.isEmpty() || stack.peek() < arr[cnt]) stack.add(arr[cnt++]);
        	else stack.pop();
   
        	
        }
        int[] stk = new int[stack.size()];
        for(int i = 0; i < stack.size(); i++) {
        	stk[i] = stack.get(i);
        }
        
        
        return stk;
    }
}