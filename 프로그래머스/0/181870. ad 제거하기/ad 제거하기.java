import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> strList = new ArrayList<>();
        
        for(String str : strArr) {
        	if(!str.contains("ad")) {
        		strList.add(str);
        	}
        }
        
        String[] answer = new String[strList.size()];
        for(int i = 0; i < strList.size(); i++) {
        	answer[i] = strList.get(i);
        }
       
        return answer;
    }
}