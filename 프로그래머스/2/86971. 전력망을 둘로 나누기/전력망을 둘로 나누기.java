import java.util.*;
class Solution {
    
    static Map<Integer, List<Integer>> adjMap ;
	static boolean[] visited;
	
	public static int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        adjMap = new HashMap<>();
        
        
        for(int i = 1; i <= n; i++) {
        	adjMap.put(i, new ArrayList<>());
        }
        
        for (int[] wire : wires) {
            int start = wire[0];
            int end = wire[1];
            adjMap.get(start).add(end);
            adjMap.get(end).add(start);
        }
        
        for (int i = 0; i < wires.length; i++) {
            visited = new boolean[n+1];
            int start = wires[i][0];
            int end = wires[i][1];
            
            
            
            adjMap.get(start).remove((Integer) end);
            adjMap.get(end).remove((Integer) start);
            
            
            
            int count1 = dfs(start);
            int count2 = dfs(end);
            
           
            
            answer = Math.min(answer, Math.abs(count1 - count2));
            
            
            adjMap.get(start).add(end);
            adjMap.get(end).add(start);

            
            
        }
       
        return answer;
    }
    
    public static int dfs(int node) {
		visited[node] = true;
		int count = 1;
		
		for(int adj : adjMap.get(node)) {
			if(!visited[adj]) {
				count += dfs(adj);
			}
		}
		return count;
	}
}