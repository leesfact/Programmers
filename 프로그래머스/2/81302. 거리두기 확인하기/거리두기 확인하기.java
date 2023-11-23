class Solution {
    
    static final int SIZE = 5;
    static char[][] room;
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        
        for(int i = 0; i < places.length; i++){
            room = new char[SIZE][SIZE];
            
            for(int j = 0; j < SIZE; j++){
                room[j] = places[i][j].toCharArray();
            }
            
            answer[i] = checkRoom() ? 1 : 0;
        }
        
        return answer;
    }
    
    public static boolean checkRoom(){
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                if(room[i][j] == 'P'){
                    if(!isKeepYourDistance(i,j)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public static boolean isKeepYourDistance(int y, int x){
        // 상하좌우 확인
        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};
        
        for (int d = 0; d < 4; d++) {
            int nextY = y + dy[d];
            int nextX = x + dx[d];
            if (nextY >= 0 && nextY < SIZE && nextX >= 0 && nextX < SIZE) {
                if (room[nextY][nextX] == 'P') return false;
            }
        }

        // 상하좌우 맨해튼 거리 2 확인
        int[] dy2 = {-2, 2, 0, 0};
        int[] dx2 = {0, 0, -2, 2};
        for (int d = 0; d < 4; d++) {
            int nextY = y + dy2[d];
            int nextX = x + dx2[d];
            if (nextY >= 0 && nextY < SIZE && nextX >= 0 && nextX < SIZE) {
                if (room[nextY][nextX] == 'P' && room[(y + nextY) / 2][(x + nextX) / 2] != 'X') {
                	return false;
                }
            }
        }

        // 대각선 확인
        int[] dy3 = {-1, -1, 1, 1};
        int[] dx3 = {-1, 1, -1, 1};
        for (int d = 0; d < 4; d++) {
            int nextY = y + dy3[d];
            int nextX = x + dx3[d];
            if (nextY >= 0 && nextY < SIZE && nextX >= 0 && nextX < SIZE) {
                if (room[nextY][nextX] == 'P') {
                    if (!(room[y][nextX] == 'X' && room[nextY][x] == 'X')) {
                    	return false;
                    }
                }
            }
        }
    	
    	return true;
       
    }
}