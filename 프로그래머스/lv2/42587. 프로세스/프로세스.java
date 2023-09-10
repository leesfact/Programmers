import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
       int answer = 0;
        
        Queue<Integer> priorityQueue = new LinkedList<>();
        Queue<Integer> locationQueue = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++) {
        	priorityQueue.add(priorities[i]);
        	locationQueue.add(i);
        }
        
        while(! priorityQueue.isEmpty()) {
        	int currentPriority = priorityQueue.poll();
        	int currentLocation = locationQueue.poll();
        	boolean hasHigherPriority = false;
        	
        	
        	for (int priority : priorityQueue) {
                if (priority > currentPriority) {
                    hasHigherPriority = true;
                    break;
                }
            }
        	
        	
        	if(hasHigherPriority) {
        		priorityQueue.add(currentPriority);
        		locationQueue.add(currentLocation);
        	}else {
        		answer++;
        		if(currentLocation == location) {
        			return answer;
        		}
        	}
        }
        
        
        
       
        return -1;
    }
}