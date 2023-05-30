import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answerList = new ArrayList<>();
        Map<String, String> mapList = new HashMap<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        
        for(String term : terms) {
        	String[] termSplit = term.split(" ");
        	mapList.put(termSplit[0],termSplit[1]);
        }
        System.out.println(mapList);
        
        LocalDate todayDate = LocalDate.parse(today, dtf);
        
        for(int i = 0; i < privacies.length; i++) {
        	String[] splitPrivacy = privacies[i].split(" ");
        	LocalDate date = LocalDate.parse(splitPrivacy[0],dtf);
        	
        	for(Map.Entry<String, String> entry : mapList.entrySet()) {
	        	if(splitPrivacy[1].contains(entry.getKey())){
	        		date = date.plusMonths(Integer.parseInt(entry.getValue()));
	        		date = date.minusDays(1);
	        		if (date.getDayOfMonth() > 28) {
                        date = date.withDayOfMonth(28);
                    }
	        		if(date.isBefore(todayDate)){
	        			answerList.add(i + 1);
	        		}
        		}
        	}
        	System.out.println(date);
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}