import java.util.*;
class Solution {
    
    static int N,M;
    static char[][] map;
    static int[][] DIRS = {{-1,0},{1,0},{0,-1},{0,1}};
    static boolean[][] visited;
    static int[] start;
    static int[] end;
    
    static class Node{
        int x,y,moves;
        
        public Node(int x, int y, int moves){
            this.x = x;
            this.y = y;
            this.moves = moves;
        }
    }
    
    public static int bfs(Node start){
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(start);
        visited[start.x][start.y] = true;
        
        while(!queue.isEmpty()){
            Node node = queue.poll();
            
            if(node.x == end[0] && node.y == end[1]){
                return node.moves;
            }
            
            
            for(int[] dir : DIRS){
                int coorX = node.x;
                int coorY = node.y;
                int moves = node.moves;
                boolean moved = false;
                
                while(canMove(coorX + dir[0], coorY + dir[1])){
                    moved = true;
                    coorX += dir[0];
                    coorY += dir[1];
                
                }
                
                if(moved && !visited[coorX][coorY]){
                    visited[coorX][coorY] = true;
                    queue.add(new Node(coorX, coorY, moves + 1));
                }
            
            }
        }
        
        return -1;
    }
    
    public static boolean canMove(int x, int y) {
		return x >= 0 && y >= 0 && x < N && y < M && map[x][y] != 'D';
	}
    
    public int solution(String[] board) {
         N = board.length;
        M = board[0].length();
        map = new char[N][M];
        visited = new boolean[N][M];
        start = new int[2];
        end = new int[2];
        
        for (int i = 0; i < N; i++) {
			map[i] = board[i].toCharArray();
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 'R') {
					start = new int[] {i, j};
					
				}else if (map[i][j] == 'G') { 
                    end = new int[] {i, j};
                }
			}
		}
        
        int answer = bfs(new Node(start[0], start[1], 0));
        
       
        return answer;
    }
}