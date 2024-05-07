class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int length = 0;
       
       for(int[] interval : intervals) {
    	   length += interval[1] - interval[0] + 1;
       }
       int[] answer = new int[length];
       int index = 0;
       
       for(int[] interval : intervals) {
    	   int start = interval[0];
    	   int end = interval[1] + 1;
    	   int size = end - start;
    	   System.arraycopy(arr, start, answer, index, size);
    	   index += size;
       }
       
       
       return answer;
    }
}