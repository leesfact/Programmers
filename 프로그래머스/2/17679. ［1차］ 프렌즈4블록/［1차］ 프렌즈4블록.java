import java.util.*;
class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        
        char[][] grid = new char[m][n];
        
        for(int i = 0; i < m ; i++) {
        	grid[i] = board[i].toCharArray();
        }
        
        
        boolean canCrush = true;
        
        while(canCrush) {
        	canCrush = false;
        	Set<String> toRemove = new HashSet<>();
        	
        	for(int i = 0; i < m - 1; i++) {
        		for(int j = 0; j < n - 1; j++) {
        			if(grid[i][j] == '0') continue;
        			char c = grid[i][j];
        			
        			if (grid[i + 1][j] == c && grid[i][j + 1] == c && grid[i + 1][j + 1] == c) {
        			    toRemove.add(i + "," + j);
        			    toRemove.add((i + 1) + "," + j);
        			    toRemove.add(i + "," + (j + 1));
        			    toRemove.add((i + 1) + "," + (j + 1));
        			    canCrush = true;
        			}
        		}
        	}
        	
        	for (String s : toRemove) {
        	    String[] parts = s.split(",");
        	    int x = Integer.parseInt(parts[0]);
        	    int y = Integer.parseInt(parts[1]);
        	    grid[x][y] = '0';
        	}
        	
        	 
        	
        	for (int j = 0; j < n; j++) {
                int emptyIdx = m - 1;
                for (int i = m - 1; i >= 0; i--) {
                    if (grid[i][j] == '0') continue;
                    if (i != emptyIdx) {
                        grid[emptyIdx][j] = grid[i][j];
                        grid[i][j] = '0';
                    }
                    emptyIdx--;
                }
            }

            answer += toRemove.size();
        	
        }
        
        return answer;
    }
}