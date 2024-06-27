import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> rank[a] - rank[b]);

       
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
            	que.add(i);
            	
            	
            }
        }
        

        
        return que.poll() * 10000 + que.poll() * 100 + que.poll();
    }
}