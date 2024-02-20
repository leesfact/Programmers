import java.util.*;
class Solution {
    static boolean[][] column;
	static boolean[][] beam;
	
	
	
	public static boolean checkColumn(int x, int y) {
		
		if(y == 0 || column[x][y-1]) return true;
		
		if((x > 0 && beam[x-1][y]) || beam[x][y]) return true;
		
		
		return false;
	}
	
	public static boolean checkBeam(int x, int y) {
		
		if(column[x][y-1] || column[x+1][y-1]) return true;
		
		if(x > 0 && beam[x-1][y] && beam[x+1][y]) return true;
		
		
		
		return false;
	}
	
	public static boolean canRemove(int x, int y) {
		
		
		for(int i = Math.max(x - 1, 0); i <= x+1; i++){
			for(int j = y; j <= y+1; j++) {
				if(column[i][j] && !checkColumn(i, j)) return false;
				
				
				if(beam[i][j] && ! checkBeam(i, j)) return false;
				
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
				}else { // 제거
					column[x][y] = false;
					if(!canRemove(x,y)) {
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
				}else {
					beam[x][y] = false;
					if(!canRemove(x,y)) {
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