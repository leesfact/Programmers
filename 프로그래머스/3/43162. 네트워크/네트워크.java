class Solution {
   static int n;
	
	public static void dfs(int node, int[][] computers) {
        for (int i = 0; i < n; i++) {
            if (computers[node][i] == 1) {
                computers[node][i] = 0; // 방문한 노드를 0으로 표시
                dfs(i, computers);
            }
        }
    }
	
	
	public static int solution(int n, int[][] computers) {
		Solution.n = n;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (computers[i][i] == 1) { 
                dfs(i, computers);
                answer++;
            }
        }

       
        return answer;
    }
}