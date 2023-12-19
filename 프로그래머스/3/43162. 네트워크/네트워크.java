import java.util.*;

class Solution {
   final static int MAX = 200 + 10;
	static boolean[][] map;
	static boolean[]visited;
	
	static int n;
	
	
	public static void dfs(int node) {
		visited[node] = true;
		
		for(int i = 1; i <= n; i++) {
			if(map[node][i] && !visited[i]) {
				dfs(i);
			}
		}
	}
	
	
	
	
	public static int solution(int n, int[][] computers) {
		Solution.n = n;
		map = new boolean[MAX][MAX];
        visited = new boolean[MAX];
        
        
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		map[i+1][j+1] = computers[i][j] == 1;
        	}
        }
        
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }
     
		
        return answer;
    }
}