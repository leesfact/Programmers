class Solution {
    public int solution(int n) {
        int sum = 0;
        if(n % 2 == 0){ // even
        	for(int i = 2; i <= n; i += 2 ) {
        		sum += (int)Math.pow(i, 2);
        	}
        }else { // odd
        	for(int i = 1; i <= n; i += 2) {
        		sum += i;
        	}
        }
        
        return sum;
    }
}