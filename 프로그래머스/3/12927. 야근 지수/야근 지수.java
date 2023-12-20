import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
       PriorityQueue<Integer> priorityWork = new PriorityQueue<>(Comparator.reverseOrder());
		
		for(int work : works) {
			priorityWork.add(work);
		}
		
		while( n > 0 && !priorityWork.isEmpty()) {
			int priorWork  = priorityWork.poll();
			if(priorWork > 0) {
				priorityWork.add(priorWork - 1);
				n--;
			}
		}
		long overtimeIndex = 0;
		
		while(!priorityWork.isEmpty()) {
			int work = priorityWork.poll();
			overtimeIndex += (long) work * work;
		}
		
       
        return overtimeIndex;
    }
}