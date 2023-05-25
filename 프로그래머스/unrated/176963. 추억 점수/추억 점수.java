import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> memory = new LinkedHashMap<>();
        
        for(int i = 0; i < name.length; i++) {
        	memory.put(name[i],yearning[i]);
        }
        
        int temp = 0;
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++) {
        	for(int j = 0; j < photo[i].length; j++) {
        		for(Map.Entry<String, Integer> entry : memory.entrySet()) {
        			if(photo[i][j].equals(entry.getKey())) {
        				temp += entry.getValue();
        			}
        		}
        	}
        	answer[i] = temp;
        	temp = 0;
        }
        
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}