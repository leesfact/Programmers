import java.util.*;
class Solution {
    public int solution(int[][] targets) {
        Arrays.sort(targets, Comparator.comparingInt(o -> o[1]));
		
		
        int missileCount = 0;
        double lastIntercept = -0.5;
        
        for(int[] target : targets) {
        	
        	if(target[0] > lastIntercept) {
        		missileCount++;
        		lastIntercept = target[1] - 0.1;
        	}
        }
    
        
        return missileCount;
    }
}