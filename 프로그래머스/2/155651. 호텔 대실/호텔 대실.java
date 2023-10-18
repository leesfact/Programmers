import java.util.*;
class Solution {
    
    static class Reservation {
		int start, end;
		
		public Reservation(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}
    public int solution(String[][] book_time) {
        List<Reservation> reservations = new ArrayList<>();
        
        for(String[] times : book_time) {
            int start = Integer.parseInt(times[0].split(":")[0]) * 60 + Integer.parseInt(times[0].split(":")[1]);
            int end = Integer.parseInt(times[1].split(":")[0]) * 60 + Integer.parseInt(times[1].split(":")[1]) + 10; 
            reservations.add(new Reservation(start, end));
        }
        
      
        reservations.sort((r1,r2) -> r1.start - r2.start);
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        
        for(Reservation r : reservations) {
    
        	if(!pq.isEmpty() && pq.peek() <= r.start) {
        		pq.poll();
        	}
        	pq.add(r.end);
        }
        
        
        
        return pq.size();
    }
}