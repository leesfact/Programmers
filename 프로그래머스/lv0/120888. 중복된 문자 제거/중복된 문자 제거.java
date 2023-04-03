import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] oldArray = new String[my_string.length()];
        LinkedHashSet<String> DupRemoveArray = new LinkedHashSet<>();
        for(int i = 0; i < my_string.length();i++) {
        	oldArray[i]= String.valueOf(my_string.charAt(i));
        	DupRemoveArray.add(oldArray[i]);
        }
        
        for(String str : DupRemoveArray) {
        	answer += str;
        }
        return answer;
    }
}