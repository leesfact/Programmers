import java.util.*;
class Solution {
    
    static List<Integer> [] adjList;
    static boolean[] visited;
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        adjList = new ArrayList[n+1];
        
        for(int i = 1; i <= n; i++){
            adjList[i] = new ArrayList<>();
        }
        
        for(int[] wire : wires){
            int start = wire[0];
            int end = wire[1];
            adjList[start].add(end);
            adjList[end].add(start);
        }
        
        for(int i = 0; i < wires.length; i++){
            visited = new boolean[n+1];
            int start = wires[i][0];
            int end = wires[i][1];
            
            adjList[start].remove((Integer)end);
            adjList[end].remove((Integer)start);
            
            int count1 = dfs(start);
            int count2 = dfs(end);
            
            answer = Math.min(answer, Math.abs(count1 - count2));
            
            
            adjList[start].add(end);
            adjList[end].add(start);
        
        }
        return answer;
    }
    
    public static int dfs(int node) {
		visited[node] = true;
		int count = 1;
		
		for(int adj : adjList[node]) {
			if(!visited[adj]) {
				count += dfs(adj);
			}
		}
		return count;
	}
}