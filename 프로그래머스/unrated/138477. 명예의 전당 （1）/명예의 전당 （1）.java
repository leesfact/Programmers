import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> temp = new ArrayList<>();
        int cnt = 0;
        
        for(int i = 1;  i <= score.length; i++) {
        	for(int j = cnt; j < i; j++) {
        		cnt++;
        		temp.add(score[i-1]);
        		if(temp.size() > k) {
        			int minIndex = temp.indexOf(Collections.min(temp));
        			temp.remove(minIndex);
        			
        		}
        		
        	}
        	answer[i-1] = Collections.min(temp);
        
        }
        
       
        return answer;
    }
}