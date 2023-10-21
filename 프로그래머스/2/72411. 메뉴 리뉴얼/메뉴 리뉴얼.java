import java.util.*;
class Solution {
    
    Map<String, Integer> map = new HashMap<>();
    
    public String[] solution(String[] orders, int[] course) {
        for(String order : orders) {
			 char[] arr = order.toCharArray();
			 Arrays.sort(arr);
			 combination(arr, "", 0);
		 }
		 
		 List<String> answerList = new ArrayList<>();
		 
		 for(int len : course) {
			 int max = 0;
			 Map<String, Integer> temp = new HashMap<>();
			 
			 for(String key : map.keySet()) {
                if(map.get(key) == max && key.length() == len) {
                    temp.put(key, map.get(key));
                } else if(map.get(key) > max && key.length() == len) {
                    max = map.get(key);
                    temp.clear();
                    temp.put(key, map.get(key));
                }
             }
			 for(String key : temp.keySet()) {
                if(temp.get(key) >= 2) {
                    answerList.add(key);
                }
             }
		 }
		 
		 Collections.sort(answerList);
         String[] answer = new String[answerList.size()];
         answerList.toArray(answer);
		
		
		 return answer;
    }
    
    public void combination(char[] arr, String str, int index) {
		 
		 if(str.length() >= 2) {
			 map.put(str, map.getOrDefault(str, 0) + 1);
		 }
		 
		 for(int i = index; i < arr.length; i++) {
			
			 combination(arr, str + arr[i], i+1);
		 }
		
	 }
}