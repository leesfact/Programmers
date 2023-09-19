import java.util.*;
import java.time.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, ArrayList<String>> dbMap = new TreeMap<>() ;
        
        for(int i = 0; i< records.length; i++) {
        	String carNumber = records[i].split(" ")[1];
        	String timeRecord = records[i].split(" ")[0];
        	
        	if(!dbMap.containsKey(carNumber)) {
        		dbMap.put(carNumber, new ArrayList<>());
        	}
        	
        	dbMap.get(carNumber).add(timeRecord);
        	
        }
        
        for(ArrayList<String> times : dbMap.values()) {
        	if(times.size() % 2 != 0) {
        		times.add("23:59");
        	}
        }
        
       
        Map<String, Integer> durationMap = new TreeMap<>();
        
        for(String carNumber : dbMap.keySet()) {
        	ArrayList<String> times = dbMap.get(carNumber);
        	int totalMin = 0;
        	
        	for(int i = 0; i < times.size(); i +=2) {
        		LocalTime inTime = LocalTime.parse(times.get(i));
        		LocalTime outTime = LocalTime.parse(times.get(i+1));
        		
        		Duration duration = Duration.between(inTime, outTime);
        		totalMin += (int) duration.toMinutes();
        	}
        	
        	durationMap.put(carNumber, totalMin);
        	
        }
        
        String[] carNumbers = durationMap.keySet().toArray(new String[0]);
        int[] answer = new int[durationMap.size()];
        for(int i = 0; i < carNumbers.length; i++) {
        	
        	int parkedMin = durationMap.get(carNumbers[i]);
        	
        
        	
            if (parkedMin <= fees[0]) {
                answer[i] = fees[1];
            } else {
                answer[i] = fees[1] + (int) Math.ceil((double)(parkedMin - fees[0]) / fees[2]) * fees[3];
            }
        }
        
        return answer;
    }
}