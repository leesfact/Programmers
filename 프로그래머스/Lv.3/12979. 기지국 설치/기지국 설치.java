class Solution {
    public int solution(int n, int[] stations, int w) {
        int range =(2*w) + 1;
        int start = 1;
        int cnt = 0;
        
        for(int station : stations) {
        	int lowerBound = Math.max(station - w, 1);
        	int upperBound = Math.min(station + w, n);
        	
        	if(start < lowerBound) {
        		int unconvered = lowerBound - start;
        		cnt += (unconvered + range - 1) / range;
        	}
        	
        	
        	start = upperBound + 1;
        }
        
        if (start <= n) {
            cnt += (n - start + range) / range;
        }

        
       
        return cnt;
    }
}