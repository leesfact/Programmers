import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[][] patterns = {
	        		{1, 2, 3, 4, 5},
	        		{2, 1, 2, 3, 2, 4, 2, 5},
	        		{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
	        };
	        int[] scores = new int[3];
	        
	        for(int i = 0; i < answers.length; i++) {
	        	for(int j = 0; j < 3; j++) {
	        		
	        		if(patterns[j][i % patterns[j].length] == answers[i]) {
	        			scores[j]++;
	        		}
	        	}
	        }
	        
	        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
	        ArrayList<Integer> winners = new ArrayList<>();
	        for(int i = 0; i < 3; i++) {
	        	if(scores[i] == maxScore) {
	        		winners.add(i + 1);
        		}
	        }
	        Collections.sort(winners);
	        
	        
	        int[] answer = new int[winners.size()];
	        int cnt = 0;
	        for(Integer a : winners) {
	        	answer[cnt++] = a;
	        }
	        
	        
	        return answer;
    }
}