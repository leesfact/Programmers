class Solution {
    static boolean[][] map;
	static boolean[] visited;
	static int answer;
	
	public void dfs(int index) {
		visited[index] = true;
		
		for(int i = 0; i < map.length; i++) {
			if(!visited[i] && map[index][i]) {
				dfs(i);
				
			}
		}
		
	}
	
	public int solution(int n, int[][] computers) {
        answer = 0;
        
        map = new boolean[n][n];
        visited = new boolean[n];
        
        
        
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		
        		if(computers[i][j] == 1) {
        			map[i][j] = true;
        		}
        	}
        }
        
        
        
        for(int i = 0; i < n; i++) {
        	if(!visited[i]) {
        		dfs(i);
        		answer++;
        	}
        }
        
        
        return answer;
    }
}