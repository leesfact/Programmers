import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
class Solution {
    public static class Assignment {
    	String subject;
    	LocalTime startTime;
    	int remainTime;
    	
    	public  Assignment(String subject, String start, int durationMin) {
			this.subject = subject;
			this.startTime = LocalTime.parse(start, DateTimeFormatter.ofPattern("HH:mm"));
			this.remainTime = durationMin;
		}
    	
    }
	
	
    public static int convert(String stringTime) {
        String[] times = stringTime.split(":");
        return Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
    }

    public static String[] solution(String[][] plans) {
        List<String> answer = new ArrayList<>();

        // Sort the plans based on start time
        Arrays.sort(plans, (x, y) -> convert(x[1]) - convert(y[1]));
        Stack<Assignment> working = new Stack<>();

        for (int i = 0; i < plans.length; i++) {
            String subject = plans[i][0];
            String startTime = plans[i][1];
            int durationMin = Integer.parseInt(plans[i][2]);
            Assignment currentAssignment = new Assignment(subject, startTime, durationMin);

            if (i == plans.length - 1) {
                answer.add(currentAssignment.subject);
            } else {
                int nextTime = convert(plans[i + 1][1]);
                int remainTime = nextTime - convert(currentAssignment.startTime.format(DateTimeFormatter.ofPattern("HH:mm")));

                working.push(currentAssignment);

                while (!working.isEmpty() && remainTime > 0) {
                    Assignment workingAssignment = working.pop();
                    int played = Math.min(remainTime, workingAssignment.remainTime);

                    if (played == workingAssignment.remainTime) {
                        answer.add(workingAssignment.subject);
                    } else {
                        workingAssignment.remainTime -= played;
                        working.push(workingAssignment);
                    }
                    remainTime -= played;
                }
            }
        }

        while (!working.isEmpty()) {
            answer.add(working.pop().subject);
        }
        
        return answer.toArray(new String[0]);
     }
}