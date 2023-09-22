import java.util.*;
class Solution {
    
    private static final int[][] DIRECTIONS = {{1,0},{-1,0},{0,1},{0,-1}};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        
        queue.offer(new int[] {0,0,1});
        visited[0][0] = true;
        
       
        while(!queue.isEmpty()) {
        	int[] current = queue.poll();
        	
        	int x = current[0];
        	int y = current[1];
        	int distance = current[2];
        	
        	
        	for(int[] direction : DIRECTIONS) {
        		int nextX = x + direction[0];
        		int nextY = y + direction[1];
        		
        		if(nextX == n - 1 && nextY == m - 1) {
        			return distance + 1;
        		}
        		
        		if(nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && 
    			   maps[nextX][nextY] == 1 && !visited[nextX][nextY]) {
        			
        			 queue.offer(new int[]{nextX, nextY, distance + 1});
        			 
                     visited[nextX][nextY] = true;
        		}
        		
        		
        	}
        	
       
        }
        
        
        
        return -1;
    }
}