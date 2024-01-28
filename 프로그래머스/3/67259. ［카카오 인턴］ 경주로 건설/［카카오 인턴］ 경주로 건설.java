import java.util.*;
class Solution {
    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; 
    static int[][][] cost; 
    static int N;
    static final int STRAIGHT = 100;
    static final int CORNER = 500;
	
    public static void bfs(int[][] board) {
        Queue<int[]> queue = new LinkedList<>();
        
        queue.offer(new int[]{0, 0, -1, 0});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int y = current[0];
            int x = current[1];
            int prevDir = current[2];
            int accCost = current[3];

            for (int i = 0; i < 4; i++) {
                int newY = y + dirs[i][0];
                int newX = x + dirs[i][1];

                if (newY >= 0 && newY < N && newX >= 0 && newX < N && board[newY][newX] == 0) {
                    int newCost = accCost + STRAIGHT;

                    
                    if (prevDir != -1 && prevDir != i) {
                        newCost += CORNER;
                    }

                    if (newCost < cost[newY][newX][i]) {
                        cost[newY][newX][i] = newCost;
                        queue.offer(new int[]{newY, newX, i, newCost});
                    }
                }
            }
        }
    }
	
	
	
    public static int solution(int[][] board) {
        N = board.length;
        cost = new int[N][N][4];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Arrays.fill(cost[i][j], Integer.MAX_VALUE);
            }
        }

        
        for (int i = 0; i < 4; i++) {
            cost[0][0][i] = 0;
        }

        bfs(board);

        
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            minCost = Math.min(minCost, cost[N - 1][N - 1][i]);
        }

        return minCost;
    }
}