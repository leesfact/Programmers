import java.util.*;
class Solution {
    public int[] solution(String msg) {
       LinkedHashMap<String, Integer> dictionary = new LinkedHashMap<>();
        List<Integer> result = new ArrayList<>();

        
        int index = 1;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
        	dictionary.put(String.valueOf(ch), index++);
        }
        
        StringBuilder sb = new StringBuilder(msg);
        
        
        while(sb.length() > 0) {
        	int i ;
        	
        	for(i = 1; i <= sb.length(); i++) {
        		System.out.println(sb.substring(0, i));
        		if(!dictionary.containsKey(sb.substring(0, i))) {
        			break;
        		}
        	}
        	
        
        	String found = sb.substring(0, i - 1);
        	
        	
        	
        	result.add(dictionary.get(found));
        	
        	if(i <= sb.length()) {
                dictionary.put(found + sb.charAt(i - 1), index++);
            }
            
            sb.delete(0, i - 1);
        	
        }
        
        
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}