import java.util.*;
class Solution {
    static Map<Integer, List<Integer>> graph;
	static boolean[] visited;
	static int[] distance;
	
	public static void bfs(int start) {
		
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = true;
		distance[start] = 0;
		
		while(!q.isEmpty()) {
			int currrent = q.poll();
			
			for(int next : graph.get(currrent)) {
				if(!visited[next]) {
					q.add(next);
					visited[next] = true;
					distance[next] = distance[currrent] + 1;
				}
			}
		}
	}
	
	
	public static int solution(int n, int[][] edge) {
		graph = new HashMap<>();
		
		for (int[] link : edge) {
			int x = link[0];
			int y = link[1];
			
			graph.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
			graph.computeIfAbsent(y, k -> new ArrayList<>()).add(x);
		}
		
		
		visited = new boolean[n+1];
		distance = new int[n+1];
		
		
		bfs(1);
		
		
        int maxDistance = 0;
        for(int i = 1; i <= n; i++) {
        	if(distance[i] > maxDistance) {
        		maxDistance = distance[i];
        	}
        }
        
        int count = 0;
        for(int i = 0; i <= n; i++) {
        	if(distance[i] == maxDistance) {
        		count++;
        	}
        }
        
        
        return count;
    }
}