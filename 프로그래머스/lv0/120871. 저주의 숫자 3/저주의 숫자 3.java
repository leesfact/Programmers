
class Solution {
    public int solution(int n) {
       int answer = 0;
	        int[] cn = new int[n];
	        cn[0] = 1;
	        
	        for(int i = 1; i < n; i++) {
	        	cn[i]= cn[i-1] + 1;
	        	
	        	if(cn[i] % 3 ==0) {
	        		cn[i] = cn[i-1] + 2;
	        	}
	        	if(String.valueOf(cn[i]).contains("3")) {
	        			cn[i] = cn[i-1] + 3;	        			
	        	}
	        	if((cn[i] / 10) % 10 == 3) {
	        		cn[i] = cn[i-1] + 11 ;
	        		if(String.valueOf(cn[i]).contains("3")) {
	        			cn[i] += 1;
	        		}
	        	}
	        	
	        	
	        	
	        	
	        }
	        answer = cn[n-1];
	        return answer;
    }
}