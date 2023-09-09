import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < progresses.length; i++) {
        	int cnt = 0;
        	
        	int temp = 100 - progresses[i];
        	
        	int day = temp % speeds[i] == 0 ? temp / speeds[i] : (temp /speeds[i]) + 1;
        	
        	list.add(day);
        	
        }
        
    
        ArrayList<Integer> answerList  = new ArrayList<>();
        
        int prevDay = list.get(0);
        int count = 1;
        
        for(int i = 1; i < list.size(); i++) {
        	if(list.get(i) <= prevDay) {
        		count++;
        	}else {
        		answerList.add(count);
        		count = 1;
        		prevDay = list.get(i);
        	}
        }
        
        answerList.add(count);
        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        
        return answer;
    }
}