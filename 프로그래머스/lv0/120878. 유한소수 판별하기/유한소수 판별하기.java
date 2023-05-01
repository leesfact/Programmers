class Solution {
    public int solution(int a, int b) {
        int answer = 0;
		 	
	        for(int i = 2; i <= a; i++) {
	        	if (a % i == 0) {
	        		if(a % i == 0 && b % i == 0) {
	        			a /= i;
	        			b /= i;	
	        			
	        		}
	        	}	
	        }
	        System.out.println("a: " + a);
	        System.out.println("b: " + b);
	        
	        if (b == 1) {
	            answer = 1;
	        } else {
	            while (b % 2 == 0) {
	                b /= 2;
	            }
	            while (b % 5 == 0) {
	                b /= 5;
	            }
	            if (b == 1) {
	                answer = 1;
	            } else {
	                answer = 2;
	            }
	        
	        }
	       // System.out.println(b);
	        System.out.println(answer);
	        return answer;
    }
}