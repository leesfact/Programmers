class Solution {
    public int[] solution(String s) {
         int[] answer = new int[2];
        
        StringBuilder sb = new StringBuilder(s);
        
        
        int cnt = 0;
        int removeZero = 0;
        int LAR = 0;
        int round = 0;
        
        while(!sb.toString().equals("1")) {
        	round ++;
        	for(int i = 0; i < sb.length(); i++) {
        		if(sb.charAt(i) == '0') {
        			sb.deleteCharAt(i);
        			i--;
        			cnt++;
        		}
        	}        	
        	LAR = sb.length();
        	
        	removeZero += cnt;
        	cnt = 0;
        	sb.setLength(0);
        	sb.append(Integer.toBinaryString(LAR));
        	
        	
        }
        	
        answer[0]= round;
        answer[1]= removeZero;        
        	
        
        return answer;
    
    }
}