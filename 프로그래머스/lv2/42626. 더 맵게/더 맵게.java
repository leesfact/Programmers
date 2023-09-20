import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
       int mixCount = 0;
        
        PriorityQueue<Integer> scovilleQueue = new PriorityQueue<>();
        
        for(int a : scoville) {
        	scovilleQueue.offer(a);
        }
        
       
        while(scovilleQueue.size() > 1 && scovilleQueue.peek() < K) {
        	int first = scovilleQueue.poll();
        	int second = scovilleQueue.poll();
        	
        	int mixScoville = first + (second * 2);
        	scovilleQueue.offer(mixScoville);
        	mixCount++;
        }
        System.out.println(scovilleQueue.peek());
        if (scovilleQueue.peek() < K) {
            return -1;
        }
        
        
        return mixCount;
    }
}