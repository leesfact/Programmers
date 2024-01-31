import java.util.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class Solution {
    static LocalTime[] busOperatingTimeList ;
	
	static class Bus{
		int n;
		int t;
		int m;
		public Bus(int n, int t, int m) {
			this.n = n;
			this.t = t;
			this.m = m;
		}
		
		public void getTime() {
			busOperatingTimeList = new LocalTime[n];
			LocalTime startTime = LocalTime.of(9, 0);
			for(int i = 0; i < n; i++) {
				busOperatingTimeList[i] = startTime;
				startTime = startTime.plusMinutes(t);
			}
		}
	}
	
	public static String solution(int n, int t, int m, String[] timetable) {
        
        List<LocalTime> crewList = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        Bus bus = new Bus(n, t, m);
        bus.getTime();
        
        for(String time : timetable) {
        	LocalTime crewTime = LocalTime.parse(time, formatter);
        	if (!crewTime.equals(LocalTime.of(23, 59))) {
                crewList.add(crewTime);
            }
        }
        Collections.sort(crewList);
        
        LocalTime answer = LocalTime.of(9, 0); 
        int crewIndex = 0;
        for(int i = 0; i < n; i++) {
        	int thisBusCapacity = m;
        	LocalTime lastCrewTime = null;
        	
        	while (crewIndex < crewList.size() && thisBusCapacity > 0 && crewList.get(crewIndex).compareTo(busOperatingTimeList[i]) <= 0) {
                lastCrewTime = crewList.get(crewIndex);
                crewIndex++;
                thisBusCapacity--;
            }
        	
        	
        	if (i == n - 1) { 
                if (thisBusCapacity > 0) {
                    answer = busOperatingTimeList[i];
                } else {
                    answer = lastCrewTime.minusMinutes(1);
                }
            }


        }
        
        return answer.format(formatter);
    }
}