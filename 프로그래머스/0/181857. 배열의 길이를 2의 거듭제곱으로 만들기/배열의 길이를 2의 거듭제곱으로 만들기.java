class Solution {
    public int[] solution(int[] arr) {
        int targetLength = 1;
		
		while(targetLength < arr.length) {
			targetLength *= 2;
		}
        
		int[] answer = new int[targetLength];
        for(int i = 0; i < arr.length; i++) {
        	answer[i] = arr[i];
        }
        
        
        
        return answer;
    }
}