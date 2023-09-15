class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        
        StringBuilder nPrimeNumber = new StringBuilder();
        
        while(n > 0) {
        	int remainder = n % k ;
        	nPrimeNumber.insert(0, remainder);
        	n /= k;
        }
        
        
    	String[] str = nPrimeNumber.toString().split("0");
    	
    	
    	
    	for(String s : str) {
    		if(s.isEmpty()) {
    			s = "1";
    		}
    		
    		long primeNumber = Long.parseLong(s);
    		if(primeNumber == 1) continue;
    		boolean isPrime = true;
    		for(long j = 2; j*j <= primeNumber; j++) {
    			if(primeNumber % j == 0) {
    				isPrime = false;
    				break;
    			}
    		}
    		if(isPrime) {
    			answer++;
    		}
    		
    	}
    	
        
        return answer;
    }
}