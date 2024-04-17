import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        Map<String, Boolean> list = new LinkedHashMap<>();
        
        for(int i = 0; i < todo_list.length; i++) {
        	list.put(todo_list[i], finished[i]);
        }
        ArrayList<String> temp = new ArrayList<>();
        
        for(Map.Entry<String, Boolean> entry : list.entrySet()) {
        	if(!entry.getValue()) {
        		temp.add(entry.getKey());
        	}
        }
        String[] answer = new String[temp.size()];
        answer = temp.toArray(answer);
        return answer;
    }
}