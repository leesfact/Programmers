import java.util.*;
class Solution {
    public String solution(String s) {
        String[] ch = s.split("");
        
        ArrayList<String> list = new ArrayList<>();
        for(String a : ch) {
        	list.add(a);
        }
        
        Collections.sort(list, Comparator.reverseOrder());
        String answer = String.join("", list);
        
        return answer;
    }
}