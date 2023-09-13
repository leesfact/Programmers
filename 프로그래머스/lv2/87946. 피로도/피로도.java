class Solution {
    
    public static int solution(int k, int[][] dungeons) {
		 boolean[] visited = new boolean[dungeons.length];
		
         return dfs(0, k, dungeons, visited);
     }
	 
	 public static int dfs(int depth, int fatigue, int[][] dungeons, boolean[] visited) {
		 
		 int maxDepth = depth;
	
		 for(int i = 0; i < dungeons.length; i++) {
			 if(!visited[i] && dungeons[i][0] <= fatigue) {
				 visited[i] = true;
				 maxDepth = Math.max(maxDepth, dfs(depth + 1, fatigue - dungeons[i][1], dungeons, visited));
				 visited[i] = false;
	
			 }
		 }
		 
		
		 return maxDepth;
     }
}