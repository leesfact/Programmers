import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int count = 0;
        
        Set<String> set = new HashSet<>();
        for(int i = 0; i<s1.length; i++) {
        	set.add(s1[i]);
        	count++;
        }
        for(int i = 0; i<s2.length; i++) {
        	set.add(s2[i]);
        	count++;
        }
        
        return count-set.size();
    }
}