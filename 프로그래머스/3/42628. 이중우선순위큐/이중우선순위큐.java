import java.util.*;
class Solution {
    public static int[] getMaxMin(PriorityQueue<Integer> pq) {
		PriorityQueue<Integer> reversePq = new PriorityQueue<>(Comparator.reverseOrder());
		reversePq.addAll(pq);
		
		if(pq.isEmpty()) return new int[] {0,0};
		
		return new int[] {reversePq.poll(), pq.poll()};
	}
	
	public static int[] solution(String[] operations) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < operations.length; i++) {
        	char command = operations[i].charAt(0);
        	int num = Integer.parseInt(operations[i].split(" ")[1]);
        	if(command == 'I') {
        		pq.add(num);
        	}else { // command == 'D'
        		if(!pq.isEmpty()) {
        			
        			if(num == -1) {
        				pq.remove();
        			}else {
        				PriorityQueue<Integer> descendingPq = new PriorityQueue<>(Comparator.reverseOrder());
        				descendingPq.addAll(pq);
        				pq.remove(descendingPq.poll());
        			}        			
        		}
        		
        	}
        }
        
       
        return getMaxMin(pq);
    }
}