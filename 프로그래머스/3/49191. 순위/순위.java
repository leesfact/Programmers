class Solution {
    static boolean[][] graph;
	static boolean[] visited;
	static int winCount;
	static int loseCount;
	
	public static void dfs(int node, int n, boolean reverse) {
		visited[node] = true;
		for (int i = 1; i <= n; i++) {
            if (!visited[i] && (reverse ? graph[i][node] : graph[node][i])) {
                if (reverse) {
                    loseCount++;
                } else {
                    winCount++;
                }
                dfs(i, n, reverse);
            }
        }
	}
	
	public static int solution(int n, int[][] results) {
        graph = new boolean[n+1][n+1];
		int answer = 0;
		
		
		for(int[] result : results) {
			graph[result[0]][result[1]] = true;
		}
		
		for(int i = 1; i <= n; i++) {
			visited = new boolean[n+1];
			winCount = 0;
			loseCount = 0;
			
			dfs(i, n, false);
			visited = new boolean[n+1];
			dfs(i, n, true);
			
			if (winCount + loseCount == n - 1) {
                answer++;
            }
		}
        
        return answer;
    }
}