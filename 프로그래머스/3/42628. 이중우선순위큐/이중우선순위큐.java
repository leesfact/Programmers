import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> descendingPq = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(String operation : operations) {
        	String[] parts = operation.split(" ");
        	char command = parts[0].charAt(0);
        	int num = Integer.parseInt(parts[1]);
        	
        	if(command == 'I') {
        		pq.add(num);
        		descendingPq.add(num);
        	}else if(command == 'D') {
        		if(!pq.isEmpty()) {
        			if(num == 1) {
        				int max = descendingPq.poll();
        				pq.remove(max);
        			}else {
        				int min = pq.poll();
        				descendingPq.remove(min);
        			}
        		}
        	}
        }
        
        if(pq.isEmpty()) {
        	return new int[] {0,0};
        }else {
        	return new int[] {descendingPq.peek(), pq.peek()};
        }
    }
}