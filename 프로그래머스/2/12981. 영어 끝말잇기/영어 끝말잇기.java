import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
       int[] answer = new int[2];
        HashSet<String> set = new HashSet<String>();
        String prev = "";
        set.add(words[0]);
        for(int i = 1; i < words.length; i ++){
            prev = words[i - 1];
            if(set.contains(words[i]) || prev.charAt(prev.length() - 1) != words[i].charAt(0)){
                answer[0] = i % n + 1;
                answer[1] = (i / n + 1) ;
                break;
            }
            set.add(words[i]);
        }
        return answer;
    }
}