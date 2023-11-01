class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length(); 
        
        int move = len - 1;
        for (int i = 0; i < len; i++) {
            char c = name.charAt(i);
            answer += Math.min(c - 'A', 'Z' - c + 1);  
            
            int nextIdx = i + 1;
        	
        	while(nextIdx < len && name.charAt(nextIdx) == 'A') {
        		nextIdx++;
        	}
        	move = Math.min(move, i + i + len - nextIdx);
            move = Math.min(move, (len - nextIdx) * 2 + i);
  
        }
        
        answer += move;
        
        return answer;
    }
}