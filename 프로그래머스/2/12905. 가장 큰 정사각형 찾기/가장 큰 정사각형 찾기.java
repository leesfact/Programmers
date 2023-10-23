class Solution
{
    public int solution(int [][]board)
    {
        int answer = 0;
        
        int row = board.length;
        int col = board[0].length;
        
        if(row < 2 || col < 2) {
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    if(board[i][j] == 1) {
                        return 1;
                    }
                }
            }
            return 0;
        }
        
        
        for(int i = 1; i < row; i++) {
        	for(int j = 1; j < col; j++) {
        		if(board[i][j] == 1) {
                    board[i][j] = Math.min(board[i-1][j-1], Math.min(board[i-1][j], board[i][j-1])) + 1;
                    answer = Math.max(answer, board[i][j]);
                }
        	}
        }
        
        
        return answer * answer;
    }
}