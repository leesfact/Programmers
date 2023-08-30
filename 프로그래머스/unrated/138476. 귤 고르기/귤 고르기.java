import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> window = new HashMap<>();
        
        for(int a : tangerine) {
        	window.put(a, window.getOrDefault(a, 0) + 1);
        }
        
        ArrayList<Integer> valuesList = new ArrayList<>(window.values());
        Collections.sort(valuesList, Collections.reverseOrder());
        
        
        int i = 0;
        int answer = 0;

        while (k > 0 && i < valuesList.size()) {
            k -= valuesList.get(i);
            i++;
            answer++;
        }
		
        return answer;
    }
}