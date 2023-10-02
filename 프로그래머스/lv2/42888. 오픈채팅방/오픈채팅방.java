import java.util.*;
class Solution {
    public String[] solution(String[] records) {
       HashMap<String, String> uidToName = new HashMap<>();
        List<String> result = new ArrayList<>();
        
        for(String record : records) {
        	String[] parts = record.split(" ");
        	String action = parts[0];
        	String uid = parts[1];
        	
        	if(!action.equals("Leave")) {
        		String nickname = parts[2];
        		uidToName.put(uid, nickname);
        	}
        }
        
        
        for(String record : records) {
        	String[] parts = record.split(" ");
        	String action = parts[0];
        	String uid = parts[1];
        	if(action.equals("Enter")) {
        		result.add(uidToName.get(uid) + "님이 들어왔습니다.");
        	}else if(action.equals("Leave")) {
        		result.add(uidToName.get(uid) + "님이 나갔습니다.");
        	}
        }
        
       
        
        return result.toArray(new String[0]);
    }
}