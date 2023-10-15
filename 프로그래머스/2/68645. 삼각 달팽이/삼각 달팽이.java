class Solution {
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
		int[] answer;
		
		int x = -1;
		int y = 0;
		int number = 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				if(i % 3 == 0) x++;
				else if (i % 3 == 1) y++;
				else if (i % 3 == 2) {x--; y--;};
				
				triangle[x][y] = number++;
			}
			
		}
		
		
		
		answer = new int[number - 1];
		int idx = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				 if(triangle[i][j] == 0) continue;
	                answer[idx++] = triangle[i][j];
				
			}
		}
		
		
		return answer;
    }
}