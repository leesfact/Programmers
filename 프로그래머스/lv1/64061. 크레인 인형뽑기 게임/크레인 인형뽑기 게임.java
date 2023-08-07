import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
         int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int[][] newBoard = new int[board.length][board[0].length];
        
        for(int i = 0; i < board.length; i++) {
        	for(int j = 0; j < board[i].length; j++) {
        		newBoard[i][j] = board[j][i];
        		
        	}
        	
        }
        
        
        for (int move : moves) {
            for (int j = 0; j < newBoard[move - 1].length; j++) {
                if (newBoard[move - 1][j] != 0) {
                    if (!stack.isEmpty() && stack.peek() == newBoard[move - 1][j]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(newBoard[move - 1][j]);
                    }
                    
                    newBoard[move - 1][j] = 0;
                    break;
                }
            }
        }
        	
        return answer;
    }
}