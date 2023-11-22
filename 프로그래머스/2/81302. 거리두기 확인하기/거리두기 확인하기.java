import java.util.*;
class Solution {
   static final int MAX = 5; 
	    static char[][] map; 
	    static boolean[][] visited; 
	    static int[][] DIRS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; 

	
	    public static int[] solution(String[][] places) {
	        int[] answer = new int[places.length];

	        for (int i = 0; i < places.length; i++) {
	            map = new char[MAX][MAX];
	            visited = new boolean[MAX][MAX];

	            for (int j = 0; j < MAX; j++) {
	                map[j] = places[i][j].toCharArray();
	            }

	            answer[i] = checkRoom() ? 1 : 0;
	        }
	        
	        System.out.println(Arrays.toString(answer));
	        return answer;
	    }
	    
	    public static boolean checkRoom() {
	    	for (int i = 0; i < MAX; i++) {
	            for (int j = 0; j < MAX; j++) {
	                if (map[i][j] == 'P') {
	                    if (!dfs(i, j, i, j ,0)) {
	                        return false;
	                    }
	                }
	            }
	        }
	        return true;
	    }
	    
	    public static boolean dfs(int y, int x, int ay, int ax, int depth) {
	    	
	    	if (Math.abs(ay - y) + Math.abs(ax - x) > 2) return true;
	    	
	    	if(map[y][x] == 'P' && depth > 0) {
	    		return false;
	    	}
	    	visited[y][x] = true;
	    	
	    	for(int[] dir : DIRS) {
	    		int ny = y + dir[0];
	            int nx = x + dir[1];
	            
	            if (ny >= 0 && nx >= 0 && ny < MAX && nx < MAX && !visited[ny][nx] && map[ny][nx] != 'X') {
	                if (!dfs(ny, nx, ay, ax, depth + 1)) {
	                    return false;
	                }
	            }
	            
	    	}
	    	
	    	visited[y][x] = false;
	    	return true;
	    }
    
}