import java.util.*;
class Point implements Comparable<Point> {
	int y, x;
	public Point(int y, int x) {
		this.y = y;
		this.x = x;
	}
	@Override
	public int compareTo(Point o) {
		if(this.y == o.y) return this.x - o.x;
		
		return this.y - o.y;
	}
	
	@Override
	public String toString() {
		
		return "(" + y + "," + x + ")";
	}
	
}

class Solution {

	
	static int[] dy = {-1, 1, 0, 0};
	static int[] dx = {0, 0, -1, 1};
	static int boardSize;
	static ArrayList<ArrayList<Point>> empty = new ArrayList<>();
	static ArrayList<ArrayList<Point>> block = new ArrayList<>();
	static boolean[][] visited;
	
	
	
	public static boolean isRotate(ArrayList<Point> empty, ArrayList<Point> block) {
		
		for(int i = 0; i < 4; i++) {
			
			int zeroY = block.get(0).y;
			int zeroX = block.get(0).x;
			
			
			
			for(int j = 0; j < block.size(); j++) {
				block.get(j).y -= zeroY;
				block.get(j).x -= zeroX;
				
			}
			
			boolean isCollect = true;
			
			for(int j = 0; j < empty.size(); j++) {
				Point emptyPoint = empty.get(j);
                Point blockPoint = block.get(j);
                
                if(emptyPoint.y != blockPoint.y || emptyPoint.x != blockPoint.x) {
                	isCollect = false;
                	break;
                }
			}
			
			if(isCollect) return true;
			else {
				for (int j = 0; j < block.size(); j++) {
                    int originY = block.get(j).y;
                    block.get(j).y = block.get(j).x;
                    block.get(j).x = -originY;
                }

                Collections.sort(block);
			}
			
			
			
		}
		
		
		
		return false;
	}
	
	public static ArrayList<Point> extract (int[][] board, int y, int x, int type) {
		
		Queue<Point> queue = new LinkedList<>();
		ArrayList<Point> bundle = new ArrayList<>();
		visited[y][x] = true;
		queue.add(new Point(y,x));
		bundle.add(new Point(0,0));
		
		
		while(!queue.isEmpty()) {
			Point current = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int ny = current.y + dy[i];
				int nx = current.x + dx[i];
				
				if(ny >= 0 && ny < boardSize && nx >= 0 && nx < boardSize) {
					if(board[ny][nx] == type && !visited[ny][nx]) {
						queue.add(new Point(ny,nx));
						visited[ny][nx] = true;
						bundle.add(new Point(ny - y, nx - x));
					}
					
				}
			}
		}
		
		Collections.sort(bundle);
		
		
		
		return bundle;
				
	}
    
   

    public static int solution(int[][] game_board, int[][] table) {
    	
    	boardSize = game_board.length;
    	
    	visited = new boolean[boardSize][boardSize];
    	
    	for(int i = 0; i < boardSize; i++) {
    		for(int j = 0; j < boardSize; j++) {
    			if(game_board[i][j] == 0 && !visited[i][j]) {
    				empty.add(extract(game_board,i,j,0));
    			}
    		}
    	}
    	
    	
    	visited = new boolean[boardSize][boardSize];
    	for(int i = 0; i < boardSize; i++) {
    		for(int j = 0; j < boardSize; j++) {
    			if(table[i][j] == 1 && !visited[i][j]) {
    				block.add(extract(table,i,j,1));
    			}
    		}
    	}
    	
    	boolean[] filledBoard = new boolean[empty.size()];
    	int filledCnt = 0;
    	
    	for(int i = 0; i < block.size(); i++) {
    		ArrayList<Point> blockCheck = block.get(i);
    		
    		for(int j = 0; j < empty.size(); j++) {
    			ArrayList<Point> emptyCheck = empty.get(j);
    			if (emptyCheck.size() == blockCheck.size() && !filledBoard[j]) {
    				if(isRotate(emptyCheck, blockCheck)) {
    					filledCnt += blockCheck.size();
    					filledBoard[j] = true;
    					break;
    				}    				
    			}
    		}
    	}
    	
        return filledCnt;
    }
}