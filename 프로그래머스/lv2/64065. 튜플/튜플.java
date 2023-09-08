import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.substring(2,s.length() - 2);
       
       String[] group = s.split("\\},\\{"); 
       
       int[][] NTuple = new int[group.length][];
       
       for(int i = 0; i < group.length; i++) {
    	   String[] nums = group[i].split(",");
    	   NTuple[i] = new int[nums.length];
    	   
    	   for(int j = 0; j < nums.length; j++) {
    		   NTuple[i][j] = Integer.parseInt(nums[j]);
    	   }
    	  
       }
        
       Arrays.sort(NTuple, Comparator.comparingInt(a -> a.length));
       
       HashSet<Integer> set = new HashSet<>();
       int[] answer = new int[NTuple.length];
       
       int index = 0;
       
       for(int[] arr : NTuple) {
    	   for(int num : arr) {
    		   if(!set.contains(num)) {
    			   set.add(num);
    			   answer[index++] = num;
    		   }
    	   }
       }
       
        return answer;
    }
}