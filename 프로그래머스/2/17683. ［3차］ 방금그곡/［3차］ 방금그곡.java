import java.time.*;
class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
		int maxDuration = 0;
		
		m = m.replaceAll("A#", "a")
			 .replaceAll("B#", "b")
			 .replaceAll("C#", "c")
			 .replaceAll("D#", "d")
			 .replaceAll("E#", "e")
			 .replaceAll("F#", "f")
			 .replaceAll("G#", "g");
		        
        
        
        for(String info : musicinfos) {
        	String[] parts = info.split(",");
        	LocalTime startTime = LocalTime.parse(info.split(",")[0]);
        	LocalTime endTime = LocalTime.parse(info.split(",")[1]);
        	Duration duration = Duration.between(startTime, endTime);
        	int playTime = (int)duration.toMinutes();        	
        	
        	String sheetMusic = parts[3].replaceAll("A#", "a")
       			 						.replaceAll("B#", "b")
	 									.replaceAll("C#", "c")
	 									.replaceAll("D#", "d")
	 									.replaceAll("E#", "e")
	 									.replaceAll("F#", "f")
	 									.replaceAll("G#", "g");
        	
        	
        	StringBuilder fullSheetMusic = new StringBuilder();
        	
        	for(int i = 0; i < playTime; i++) {
        		fullSheetMusic.append(sheetMusic.charAt(i % sheetMusic.length()));
        	}
        	
        	if (fullSheetMusic.toString().contains(m) && playTime > maxDuration) {
                answer = parts[2]; 
                maxDuration = playTime; 
            }

        	
        }
        
        return answer;
    }
}