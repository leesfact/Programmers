import java.util.*;
class Solution {
    static int[][] DIRS = {{-1,0},{1,0},{0,-1},{0,1}};
    static int[][][] cost; 
    static int N;
    static final int STRAIGHT_COST = 100;
    static final int CORNER_COST = 500;
    
    public static void dfs(int[][] board, int y, int x, int prevDir, int accCost) {
        if (y == N - 1 && x == N - 1) {
            cost[y][x][prevDir] = Math.min(cost[y][x][prevDir], accCost);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int newY = y + DIRS[i][0];
            int newX = x + DIRS[i][1];

            if (newY >= 0 && newY < N && newX >= 0 && newX < N && board[newY][newX] == 0) {
                int newCost = accCost + STRAIGHT_COST;
                
                
                if (prevDir != -1 && prevDir != i) {
                    newCost += CORNER_COST;
                }

                if (newCost < cost[newY][newX][i]) {
                    cost[newY][newX][i] = newCost;
                    dfs(board, newY, newX, i, newCost);
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

        dfs(board, 0, 0, -1, 0);

        
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            if (cost[N-1][N-1][i] < minCost) {
                minCost = cost[N-1][N-1][i];
            }
        }

        return minCost;
    }
}