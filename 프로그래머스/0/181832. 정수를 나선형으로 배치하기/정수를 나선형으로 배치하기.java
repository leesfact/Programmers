class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        
        int x = 0, y = 0;
        
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        int dir = 0;
        
        while(num <= n * n) {
        	answer[x][y] = num++;
        	int nx = x + dx[dir];
        	int ny = y + dy[dir];
        	
        	if (nx >= 0 && nx < n && ny >= 0 && ny < n && answer[nx][ny] == 0) {
                x = nx;
                y = ny;
            } else {
                dir = (dir + 1) % 4; 
                x = x + dx[dir];
                y = y + dy[dir];
            }
        }
        
        
        return answer;
    }
}