class Solution {
    public int[] solution(int[] num_list, int n) {
        int startIndex = n - 1;
        int[] answer = new int[num_list.length - startIndex];
        for(int i = startIndex; i < num_list.length; i++) {
        	answer[i - startIndex] = num_list[i];
        }
        
        return answer;
    }
}