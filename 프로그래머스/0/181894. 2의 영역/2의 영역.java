import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> indexList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] == 2) { 
        		indexList.add(i);
        	}
        }
        
        if(indexList.size() == 0) return new int[] {-1};
        
        int[] answer = new int[indexList.get(indexList.size() - 1) - indexList.get(0) + 1];
        
        int cnt = 0;
        for(int i = indexList.get(0); i <= indexList.get(indexList.size() - 1); i++) {
        	answer[cnt++] = arr[i];
        }
        
        
        return answer;
    }
}