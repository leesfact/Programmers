import java.util.*;
class Solution {
    public String solution(String[] surveys, int[] choices) {
        String answer = "";
		HashMap<Character, Integer> map = new HashMap<>();
		
		char[] possibleChars = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
		for (char ch : possibleChars) {
		    map.put(ch, 0);
		}
		
		
		for(int i = 0; i < surveys.length; i++) {
			if(choices[i] > 4) {
				map.put(surveys[i].charAt(1), map.get(surveys[i].charAt(1)) + choices[i] - 4);
			}else {
				map.put(surveys[i].charAt(0), map.get(surveys[i].charAt(0)) + 4 - choices[i]);
			}
		}
		
		
		if (map.get('R') >= map.get('T'))
            answer += "R";
        else
            answer += "T";

        if (map.get('C') >= map.get('F'))
            answer += "C";
        else
            answer += "F";

        if (map.get('J') >= map.get('M'))
            answer += "J";
        else
            answer += "M";

        if (map.get('A') >= map.get('N'))
            answer += "A";
        else
            answer += "N";
        
        
        return answer;
    }
}