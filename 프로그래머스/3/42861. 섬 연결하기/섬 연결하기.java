import java.util.*;
class Solution {
    static int[] parent;
	
	public static int find(int node) {
		if(parent[node] == node) {
			return node;
		}
		
		return parent[node] = find(parent[node]);
	}
	
	
	public static void union(int a, int b) {
		int rootA = find(a);
		int rootB = find(b);
		if(rootA != rootB) {
			parent[rootB] = rootA;
		}
	}
	
	
	public static int solution(int n, int[][] costs) {
        int answer = 0;
        
        parent = new int[n];
        
        for(int i = 0; i < n; i++) {
        	parent[i] = i;
        }
        
        Arrays.sort(costs, Comparator.comparingInt(o -> o[2]));
        
       
        for(int[] cost : costs) {
        	int a = find(cost[0]);
        	int b = find(cost[1]);
        	
        	if(a != b) {
        		union(a,b);
        		answer += cost[2];
        	}
        }
        
        
        return answer;
    }
}