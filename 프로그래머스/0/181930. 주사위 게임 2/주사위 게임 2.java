class Solution {
    public int solution(int a, int b, int c) {
        int total = 0;
        if(a == b && b == c) {
        	total = (a+b+c) 
        			* (int)(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2))
        			* (int)(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3));
        }else if(a != b && b != c && c != a) {
        	total = (a+b+c);
        }else {
        	total = (a+b+c) 
        			* (int)(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2));
        }
        
        
        return total;
    }
}