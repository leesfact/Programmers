class Solution {
    public long solution(int k, int d) {
        long total = 0;  
        
        for(int x = 0; x <= d; x += k) {
     
        	long dSquare = (long) d * d;
        	long xSquare = (long) x * x;
        	
        	
        	
        	int maxY = (int) Math.sqrt(dSquare - xSquare);
        	
        	total += (maxY / k) + 1;
        }
        
        
        return total;
    }
}