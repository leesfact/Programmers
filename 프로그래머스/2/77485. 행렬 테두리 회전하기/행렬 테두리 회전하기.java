import java.util.*;
class Solution {
    static int[][] map;
	static ArrayList<Integer> minList ;
	
	public static void rotation(int y1, int x1, int y2, int x2) {
		
		int temp = map[y1][x1];
		int min = temp;
		
		
		
	    for (int i = y1; i < y2; i++) {
	        map[i][x1] = map[i + 1][x1];
	        min = Math.min(min, map[i][x1]);
	    }

	   
	    for (int i = x1; i < x2; i++) {
	        map[y2][i] = map[y2][i + 1];
	        min = Math.min(min, map[y2][i]);
	    }

	   
	    for (int i = y2; i > y1; i--) {
	        map[i][x2] = map[i - 1][x2];
	        min = Math.min(min, map[i][x2]);
	    }

	    
	    for (int i = x2; i > x1 + 1; i--) { 
	        map[y1][i] = map[y1][i - 1];
	        min = Math.min(min, map[y1][i]);
	    }

	    map[y1][x1 + 1] = temp; 
	    
	    
	    
	    minList.add(min); 
		
	}
	
	public static int[] solution(int rows, int columns, int[][] queries) {
		int N = rows;
		int M =  columns;
		map = new int[N+1][M+1];
		minList = new ArrayList<>();

		int num = 1;
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= M; j++) {
				map[i][j] = num++;
			}
		}
		
		for(int[] query : queries) {
			int y1 = query[0];
			int x1 = query[1];
			int y2 = query[2];
			int x2 = query[3];

			rotation(y1, x1, y2, x2);
		}
		
		int[] answer = new int[minList.size()];
	    for (int i = 0; i < minList.size(); i++) {
	        answer[i] = minList.get(i);
	    }
	    return answer;
    }
}