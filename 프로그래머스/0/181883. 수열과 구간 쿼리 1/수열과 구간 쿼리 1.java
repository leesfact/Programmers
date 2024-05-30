class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] copyArr = arr.clone();
        
        for(int[] query : queries) {
        	
        	for(int i = query[0]; i <= query[1]; i++) {
        		copyArr[i]++;
        	}
        }
        
        
        return copyArr;
    }
}