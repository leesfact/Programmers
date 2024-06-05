class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int temp = 0;
        for(int[] query : queries) {
        	int startInx = query[0];
        	int endInx = query[1];
        	temp = arr[startInx];
        	arr[startInx] = arr[endInx];
        	arr[endInx] = temp;
        }
        
        return arr;
    }
}