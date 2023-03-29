class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizcnt = 1;
        
        
        while(true) {
        	if((6*pizcnt) % n == 0) {
        		answer =  (6 * pizcnt) / 6;
        		break;
        	}
        	pizcnt++;
        }
        return answer;
    }
}