import java.util.*;
class Solution {
    public int solution(String dirs) {
        int[] current = {0,0};
	        Set<List<Integer>> paths = new LinkedHashSet<>();

	        
	        for(int i = 0; i < dirs.length(); i++) {
	        	int oldX = current[0];
	        	int oldY = current[1];
	        	switch (dirs.charAt(i)) {
				case 'U':
					current[1] +=1;
					break;
					
				case 'D':
					current[1] -=1;
					break;
					
				case 'R':
					current[0] +=1;
					break;

				default:
					current[0] -=1;
					break;
					
				}
	        	
	        	
	        	if (current[0] < -5 || current[0] > 5 || current[1] < -5 || current[1] > 5) {
	                
	                current[0] = oldX;
	                current[1] = oldY;
	                continue;
	            }
	            
	            paths.add(Arrays.asList(oldX, oldY, current[0], current[1]));
	            paths.add(Arrays.asList(current[0], current[1], oldX, oldY));
	        	
	        	
	        	
	        	
	        }
	 
	      
	        return paths.size() / 2;
    }
}