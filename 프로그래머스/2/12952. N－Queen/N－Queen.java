import java.util.*;
class Solution {
    public static boolean isSafe(char[][] board, int row, int col, int n) {
		
		for(int i = 0; i < col; i++) {
			if(board[row][i] == 'Q') {
				return false;
			}
		}
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
	        if (board[i][j] == 'Q') {
	            return false;
	        }
	    }

	
	    for (int i = row, j = col; j >= 0 && i < n; i++, j--) {
	        if (board[i][j] == 'Q') {
	            return false;
	        }
	    }

	    return true;
	}
	
	public static int solveNQUtil(char[][] board, int col, int n) {
		 if (col == n) {
			 	return 1;
	        }
	        int count = 0;
	        for (int i = 0; i < n; i++) {
	            if (isSafe(board, i, col, n)) {
	                board[i][col] = 'Q';
	                count += solveNQUtil(board, col + 1, n);
	                board[i][col] = '.'; 
	            }
	        }
	        
	        return count;
	}
	
	public static int solution(int n) {
		
		char[][] board = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(board[i], '.');
		}
		
        int answer = solveNQUtil(board, 0, n);
        System.out.println(answer);
        return answer;
    }
}