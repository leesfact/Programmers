class Solution {
    static int MAX = 3;
	static char[][] map;
	
	
	public static boolean checkLine(char player) {
		
		for(int i = 0; i < MAX; i++) {
			if(map[i][0] == player && map[i][1] == player && map[i][2] == player) return true;
			if(map[0][i] == player && map[1][i] == player && map[2][i] == player) return true; 
		}
		// 대각선 확인
		if(map[0][0] == player && map[1][1] == player && map[2][2] == player) return true;
		if(map[0][2] == player && map[1][1] == player && map[2][0] == player) return true;
		
		return false;
	}
	
	
	public static boolean isValidMap() {
		
		int Ocnt = 0;
		int Xcnt = 0;
		
		for(int i = 0; i < MAX; i++) {
			for(int j = 0; j < MAX; j++) {
				if(map[i][j] == 'O') Ocnt++;
				else if(map[i][j] == 'X') Xcnt++;
			}
		}
		
        if (Ocnt == 0 && Xcnt > 0) return false;
        
		if(Math.abs(Ocnt - Xcnt) > 1) return false;
		
		// 직선 검사
		boolean oLine = checkLine('O');
		boolean xLine = checkLine('X');
		
		if(oLine && xLine) return false;
		if(oLine && Ocnt != Xcnt + 1) return false;
		if(xLine && Ocnt != Xcnt) return false;
		
		return true;
	}
	
	public static int solution(String[] boards) {
        
        map = new char[MAX][MAX];
        
        
        for(int i = 0; i < MAX; i++) {
        	for(int j = 0; j< MAX; j++) {
        		map[i][j] = boards[i].charAt(j);
        	}
        }
        
        
        return isValidMap() ? 1 : 0;
    }
}