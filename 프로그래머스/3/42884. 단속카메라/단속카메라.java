import java.util.*;
class Solution {
    public int solution(int[][] routes) {
       Arrays.sort(routes, Comparator.comparing(o -> o[1]));
        
        int cameraCount = 0;
        int lastCamera = Integer.MIN_VALUE;
        
        for(int[] route : routes) {
        	
        	if(route[0] > lastCamera) {
        		cameraCount++;
        		lastCamera = route[1];
        	}
        }
        
        return cameraCount;
    }
}