class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        int cnt = 0;
        
        while(true) {
        	if( n == 1) {
        		answer = 0;
        		break;
        	}
	        if(n % 2 ==0) {
	        	n /= 2;
	        	cnt ++;
	        }else {
	        	n = (n * 3) + 1;
	        	cnt++;
	        }
        }
        
        if(cnt >500) {
        	answer = -1;
        }else {
        	answer = cnt;
        }
 
        return answer;
    }
}