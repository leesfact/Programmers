import java.util.*;
class Solution {
    
    static int[] board;
    static int answer;
    public int solution(int n) {
        
        board = new int[n];
        
        backTracking(0,n);
        return answer;
    }
    
    public static void backTracking(int depth, int n){
        if(depth == n){
            answer++;
            return;
        }
        
        for(int i = 0; i < n; i++){
            board[depth] = i;
            if(valid(depth)){
                backTracking(depth + 1, n);
            }
        }
        
    }
    
    public static boolean valid(int i){
        for(int j = 0; j < i; j++){
            if(board[i] == board[j]) return false;
            if (Math.abs(i - j) == Math.abs(board[i] - board[j])) return false;
        }
        return true;
    }
}