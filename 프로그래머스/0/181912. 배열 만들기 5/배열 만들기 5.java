import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        for(String intStr : intStrs) {
        	if(Integer.parseInt(intStr.substring(s, s+l)) > k) list.add(Integer.parseInt(intStr.substring(s, s+l)));
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}