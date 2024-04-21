class Solution {
    public int[] solution(int[] num_list, int n) {
         StringBuilder sb = new StringBuilder("");
        
        for(int i = n; i < num_list.length; i++) {
        	sb.append(num_list[i]);
        }
        
        for(int i = 0; i < n; i++) {
        	sb.append(num_list[i]);
        }
        
        int[] answer = new int[num_list.length];
        
        int cnt = 0;
        for(String str : sb.toString().split("")) {
        	answer[cnt++] = Integer.parseInt(str);
        }
        
        return answer;
    }
}