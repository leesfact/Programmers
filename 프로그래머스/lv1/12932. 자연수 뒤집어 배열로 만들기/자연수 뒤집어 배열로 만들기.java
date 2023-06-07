class Solution {
    public int[] solution(long n) {
        String size = Long.toString(n);
		
		int[] answer = new int[size.length()];
		
		for(int i = 0; i < size.length(); i++) {
			answer[i] = Integer.parseInt(size.split("")[size.length()-i-1]);	
		}
		
		
        return answer;
    }
}