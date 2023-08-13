import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] reports, int k) {
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> suspendID = new LinkedHashMap<>();
        for(String list : id_list) {
        	map.put(list, new ArrayList<>());
        	suspendID.put(list, 0);
        }
        
        for(String report : reports) {
        	String reporter = report.split(" ")[0];
        	String reported = report.split(" ")[1];
        	
        	if (map.containsKey(reporter) && !map.get(reporter).contains(reported)) {
                map.get(reporter).add(reported); 
            }
        	
        }
        
        for(List<String> reportedList : map.values()) {
        	for(String reported : reportedList) {
        		suspendID.put(reported, suspendID.get(reported) + 1);
        	}
        }
        int[] answer = new int[id_list.length];
        
        for(int i = 0; i < id_list.length; i++) {
        	String user = id_list[i];
        	List<String> reportedList = map.get(user);
        	
        	for(String reported : reportedList) {
        		if(suspendID.get(reported) >= k) {
        			answer[i]++;
        		}
        	}
        }
        
            
        return answer;
    }
}