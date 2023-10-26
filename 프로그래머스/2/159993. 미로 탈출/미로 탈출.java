import java.util.*;
class Solution {
    
    static int[][] DIRS = {{-1,0},{1,0},{0,-1},{0,1}};
    
    public static int[] bfs(char[][] maze, int startX, int startY, char target){
        int n = maze.length;
		int m = maze[0].length;
		
		boolean[][]visited = new boolean[n][m];
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {startX, startY, 0});
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			
			int x = current[0];
			int y = current[1];
			int distance = current[2];
			
			
			if(maze[x][y] == target) return new int[] {x,y,distance};
			
			
			for(int i = 0; i < 4; i++) {
				int nx = x + DIRS[i][0];
				int ny = y + DIRS[i][1];
				
				if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
				if(maze[nx][ny] == 'X' || visited[nx][ny]) continue;
				
				visited[nx][ny] = true;
				
				queue.add(new int[] {nx, ny, distance + 1});
				
			}
			
		}
		
		
		
		return new int[] {-1, -1, -1};
    }
    
    public static int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        char[][] maze = new char[n][m];
        int startX = 0, startY = 0;
        
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < m; j++) {
        		maze[i][j] = maps[i].charAt(j);
        		if(maze[i][j] == 'S') {
        			startX = i;
        			startY = j;
        		}
        	}
        }
        
        int[] leverPosition = bfs(maze, startX, startY, 'L');
        if(leverPosition[2] == -1) return -1;
        
        
        
        int fromLeverToEnd = bfs(maze, leverPosition[0], leverPosition[1], 'E')[2];
        if(fromLeverToEnd == -1) return -1;
        
       
        
        return leverPosition[2] + fromLeverToEnd;
    }
}