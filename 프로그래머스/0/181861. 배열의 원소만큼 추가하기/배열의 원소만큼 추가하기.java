class Solution {
    public int[] solution(int[] arr) {
       int arraySize = 0;
		
		for(int a : arr) {
			arraySize += a;
		}
		
		int[] answer = new int[arraySize];
		
		int cnt = 0;
		for(int array : arr) {
			int tempValue = array;
			while(tempValue-- > 0) {
				answer[cnt++] = array;
			}
		}
		
		
        return answer;
    }
}