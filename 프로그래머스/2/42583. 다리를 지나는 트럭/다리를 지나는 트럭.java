import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();
        
        for(int truck_weight : truck_weights) {
        	queue.add(truck_weight);
        }
        
        int currentWeightOnBridge = 0;
        
        for(int i = 0; i < bridge_length; i++) {
        	bridge.add(0);
        }
        
        while(!queue.isEmpty() || currentWeightOnBridge > 0) {
        	answer++;
        	
        	currentWeightOnBridge -= bridge.poll();
        	
        	if(!queue.isEmpty() && currentWeightOnBridge + queue.peek() <= weight) {
        		int nextTruckWeight = queue.poll();
        		bridge.add(nextTruckWeight);
        		currentWeightOnBridge += nextTruckWeight;
        		
        	}else {
        		bridge.add(0);
        	}
        	
        	
        }
        
       	
        return answer;
    }
}