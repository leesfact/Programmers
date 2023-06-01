class Solution {
    public int solution(int n) {
        
        int x = 1;
        while(x > 0) {
        	x++;
        
        	if(n % x == 1) {
        		break;        		
        	}
        }
        return x;
    }
}