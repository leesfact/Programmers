import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
             if (x == y) {
			 return 0;
		 }
	        
		 boolean[] visited = new boolean[y+1];
		 Queue<int[]> queue = new LinkedList<>();
		 
		 queue.offer(new int[] {x,0});
		 visited[x] = true;
		 
		 while(!queue.isEmpty()) {
			 int[] current = queue.poll();
			 int currentValue = current[0];
			 int currentCount = current[1];
			 
			 int[] nextValues = new int[]{currentValue + n, currentValue * 2, currentValue * 3};
			 
			 
			 for(int nextValue : nextValues) {
				 
	                if(nextValue == y) {
	                    return currentCount + 1;
	                }
	                
	                if(nextValue > 0 && nextValue <= y && !visited[nextValue]) {
	                    visited[nextValue] = true;
	                    queue.offer(new int[]{nextValue, currentCount + 1});
	                }
	            }
		 }
		 
		 
	     return -1;
    }
}