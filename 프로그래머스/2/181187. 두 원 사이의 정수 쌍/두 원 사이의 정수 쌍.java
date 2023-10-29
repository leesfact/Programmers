class Solution {
    public long solution(int r1, int r2) {
         long count = 0;
        
        for(long x = -r2; x <= r2; x++) {
        	long yUpper = (long)Math.sqrt((long)r2*r2 - x*x);
        	long yLower = (long)Math.ceil(Math.sqrt((long)r1*r1-x*x));
        	
        	if(yLower <= yUpper) {
        		count += (yUpper - yLower + 1);
        	}
        	
        	 if (x == 0) { 
                 count -= (yUpper - yLower + 1);
             }
        }
        
        
        
        
        
        return count * 2;
    }
}