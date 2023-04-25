class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
		int x = 0;
		int y = 0;
      
        for(int i = 0; i < keyinput.length; i++) {
        	if(keyinput[i].equals("up")) {
        		y++;
        
        	}else if(keyinput[i].equals("down")) {
        		y--;
        		
        	}else if (keyinput[i].equals("left")) {
        		x--;
        		
        	}else {
        		x++;
        	}
        	
        	if(x < -(board[0]/2)){
        		x = -(board[0]/2);
        	}else if (x > board[0]/2) {
        		x = board[0]/2;
        	}
        	
        	if(y < -(board[1]/2)) {
        		y = -(board[1]/2);
        	}else if (y > board[1]/2) {
        		y = board[1]/2;
        	}
        }
        answer[0] = x;
        answer[1] = y;
        
        
        return answer;
    }
}