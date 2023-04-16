import java.util.LinkedHashSet;
import java.util.Set;
class Solution {
    public static Set<Integer> solution(int n) {
        Set<Integer> answer = new LinkedHashSet<>();
       
        	for(int i = 2; i <= n; i++) {
        		while(n%i == 0 ) {
        			n /= i;
        			answer.add(i);
        		}
        	}
        return answer;
    }
}