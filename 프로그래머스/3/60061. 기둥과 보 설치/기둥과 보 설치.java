import java.util.*;
class Solution {
    static boolean[][] column;
	static boolean[][] beam;
	
	
	public static boolean checkColumn(int x, int y) {
		if(y == 0 || column[x][y-1]) return true; // 지면 위에 
		
		//현재 x좌표 이전(x-1)에 보가 있는지 또는 현재 x좌표에 보가 있는지
		if((x > 0 && beam[x-1][y]) || beam[x][y]) return true; 
		
		
		return false;
				
	}
	
	public static boolean checkBeam(int x, int y) {
		// 현재 x, y-1 좌표에 기둥이 있는 경우, 현재 x+1, y-1 좌표에 기둥이 있는 경우
		if(column[x][y-1] || column[x+1][y-1]) return true;
		
		// 양쪽에 보가 있는 경우
		if(x > 0 && beam[x-1][y] && beam[x+1][y]) return true;
		
		return false;
	}
	
	public static boolean canDelete(int x, int y) {
		for(int i = Math.max(x - 1, 0); i <= x + 1; i++) {
			for(int j = y; j <= y + 1; j++) {
				if(column[i][j] && !checkColumn(i, j)) {
					return false;
				}
				if(beam[i][j] && !checkBeam(i, j)) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static int[][] solution(int n, int[][] build_frame) {
       
		column = new boolean[n+2][n+2];
		beam = new boolean[n+2][n+2];
        
		int count = 0;
		for(int[] build : build_frame) {
			int x = build[0];
			int y = build[1];
			int type = build[2];
			int cmd = build[3];
			
			
			if(type == 0) { // column
				if(cmd == 1) { // 설치
					if(checkColumn(x,y)) {
						column[x][y] = true;
						count++;
					}
				}else { // 삭제
					column[x][y] = false;
					if(!canDelete(x,y)) {
						column[x][y] = true;
					}else {
						count--;
					}
				}
				
			}else { // beam
				if(cmd == 1) {
					if(checkBeam(x,y)) {
						beam[x][y] = true;
						count++;
					}
				}else { // 삭제
					beam[x][y] = false;
					if(!canDelete(x,y)) {
						beam[x][y] = true;
							
					}else {
						count--;
					}
				}					
				
			}
		}
			
		
		
		int[][] answer = new int[count][3];
		count = 0;
		
		
		
		for(int x = 0; x <= n; x++) {
			for(int y = 0; y <= n; y++) {
				if(column[x][y]) {
					answer[count][0] = x;
					answer[count][1] = y;
					answer[count++][2] = 0;
				}
				if(beam[x][y]) {
					answer[count][0] = x;
					answer[count][1] = y;
					answer[count++][2] = 1;
				}
			}
		}

		
        return answer;
    }
}