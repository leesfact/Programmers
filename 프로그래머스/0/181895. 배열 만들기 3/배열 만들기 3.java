import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> arrList = new ArrayList<>();
        ArrayList<Integer> newList = new ArrayList<>();
        for(int a : arr) {
        	arrList.add(a);
        }
        
        for(int[] interval : intervals) {
        	int start = interval[0]; 
        	int end = interval[1];
        	
        	newList.addAll(arrList.subList(start, (end+1)));
        }
       
        
        int[] answer = new int[newList.size()];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = newList.get(i);
        }
        
        return answer;
    }
}