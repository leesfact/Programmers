import java.util.*;
class Solution {
    static int[] Node;
	static ArrayList<Integer>[]  graph = new ArrayList[17];
	static boolean[][][] visited;
	static int maxSheep;
	
	static void dfs(int pos, int sheep, int wolves) {
		if(visited[pos][sheep][wolves]) return;
		visited[pos][sheep][wolves] = true;
		
		int backupSheep = sheep;
		int backupWolves = wolves;
		
		int backupNode = Node[pos];
		
		
		if(Node[pos] == 0) sheep++;
		else if(Node[pos] == 1) wolves++;
		
		Node[pos] = -1;
		
		if(wolves < sheep) {
			maxSheep = Math.max(maxSheep, sheep);
			for(int next : graph[pos]) {
				dfs(next, sheep, wolves);
			}
		}
		
		Node[pos] = backupNode;
		visited[pos][backupSheep][backupWolves] = false;
		
	}
	
	public static int solution(int[] info, int[][] edges) {
        
		Node = info;
		
        for(int i = 0; i < Node.length; i++) {
        	graph[i] = new ArrayList<>();
        }
        
        for(int[] edge : edges) {
        	graph[edge[0]].add(edge[1]);
        	graph[edge[1]].add(edge[0]);
        }
        
        visited = new boolean[17][18][18];
        maxSheep = 0;
        dfs(0, 0, 0);
       
        return maxSheep;
    }
}