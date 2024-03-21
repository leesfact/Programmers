class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int cnt = 0;
        for(int num : num_list) {
        	answer[cnt++] = num;
        }
       
        
        answer[answer.length - 1] = num_list[num_list.length - 1] > num_list[num_list.length - 2] ? 
        		num_list[num_list.length - 1] - num_list[num_list.length - 2] : num_list[num_list.length - 1] * 2;
        
        return answer;
    }
}