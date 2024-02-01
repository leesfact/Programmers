class Solution {
    public static final int INF = 10_000_000;
	
	public static int solution(int n, int s, int a, int b, int[][] fares) {
		int[][] graph = new int[n+1][n+1];
		
        
        for(int i = 1; i <= n; i++) {
        	for(int j = 1; j <= n; j++) {
        		if(i == j) graph[i][j] = 0;
        		else graph[i][j] = INF;
        	}
        }
        
        for(int[] fare : fares) {
        	int x = fare[0];
        	int y = fare[1];
        	int fee = fare[2];
        	
        	graph[x][y] = fee;
        	graph[y][x] = fee;
        }
        
        for(int k = 1; k <= n; k++) {
        	for(int i = 1; i <= n; i++) {
        		for(int j = 1; j <= n; j++) {
        			if(graph[i][k] != INF && graph[k][j] != INF){
        				graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
        				
        			}
        		}
        	}
        }
        
        int minFare = graph[s][a] + graph[s][b];
        
        for(int i = 1; i <= n; i++) {    
        	minFare = Math.min(minFare, graph[s][i] + graph[i][a] + graph[i][b]);
        }
        
        return minFare;
    }
}