import java.util.*;
class Solution {
    public int solution(int[] ingredients) {
        int cnt = 0;
		  Stack<Integer> stack = new Stack<>();
		  
		  for(int ingredient : ingredients) {
			  stack.push(ingredient);
			  
			  if(stack.size() >= 4) {
				  int last = stack.pop();
				  int third = stack.pop();
				  int second = stack.pop();
				  int first = stack.pop();
				  
				  if (first == 1 && second == 2 && third == 3 && last == 1) {
	                    cnt++;
	                } else {
	                    stack.push(first);
	                    stack.push(second);
	                    stack.push(third);
	                    stack.push(last);
	                }
						  
			  }
		  }
		  
		 
	      return cnt;
    }
}