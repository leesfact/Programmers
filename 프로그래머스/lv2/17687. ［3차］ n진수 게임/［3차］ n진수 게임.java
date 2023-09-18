class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder result = new StringBuilder();
		
		String chars = "0123456789ABCDEF";
		
		int number = 0;
		
		while(result.length() <  m * t){
			int currentNumber = number++;
			StringBuilder temp = new StringBuilder();
			
			
			do {
				temp.insert(0, chars.charAt(currentNumber % n));
				currentNumber /= n;
			}while(currentNumber > 0); 
			
			result.append(temp);
			
		}
		
		StringBuilder tubeResult = new StringBuilder();
		
		for(int i = 0; i < t; i++) {
			tubeResult.append(result.charAt(p - 1 + m * i));
		}
		
        return tubeResult.toString();
    }
}