class Solution {
    public int solution(int a, int b, int n) {
         int answer = 0;
       
        while( n >= a) {
        	int quotient = n / a;
        	int remainder = n % a;
        
        	n = quotient * b + remainder;
            
        	answer += quotient * b;
        }
       
       
        
    	
        
        

    
        return answer;
    }
}