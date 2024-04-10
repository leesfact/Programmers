import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
         Set<Integer> deleteSet = new HashSet<>();
        
        for(int num : delete_list) {
        	deleteSet.add(num);
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        
        for(int num : arr) {
        	if(!deleteSet.contains(num)) {
        		resultList.add(num);
        	}
        }
        
        System.out.println(resultList);
        
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        
        return answer;
    }
}