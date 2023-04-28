import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


class Solution {
    public int[] solution(int[][] score) {
          Double[] averge = new Double[score.length];
        
        for(int i = 0; i < score.length; i++) {
        		averge[i] =(double)(score[i][0] + score[i][1]) / 2;
        }
       
        Double[] scoreCopy = Arrays.copyOf(averge, averge.length);
        Arrays.sort(averge,Comparator.reverseOrder());
        Map<Integer,Double > map = new HashMap<>();
        for(int i = 0; i < averge.length; i++) {
        	map.put(i+1, averge[i]);
        }
    
        int[] answer = new int[averge.length];
        for(int i = 0; i < averge.length; i++) {
        	if(map.containsValue(scoreCopy[i])) {
        		for(Map.Entry<Integer, Double> entry : map.entrySet()) {
        			if(entry.getValue().equals(scoreCopy[i])) {
        				answer[i] = entry.getKey();
        				break;
        			}
        		}
        	}
        }
        
        return answer;
    }
}