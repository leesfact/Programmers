import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
         Queue<Integer> queue = new LinkedList<>();
        
        
        for(int price : prices) {
        	queue.add(price);
        }
        
        
        int[] answer = new int[prices.length];
        int cnt = 0;
        while(!queue.isEmpty()) {
        	cnt++;
        	int temp = queue.poll();
        	
	        	int second = 0;
        		for(int a : queue) {
        			if(temp > a) {
        				second++;
        				break;
        			}else {
        				second++;
        			}
        			
        		}
        	
        		
        		
        	answer[cnt - 1] = second;
    		
        }
        
       
        return answer;
    }
}