import java.util.*;
class Solution {
    static Set<String> set = new LinkedHashSet <>();
    
    public static void dfs(String prefix, String remaining) {
		
		if(!prefix.isEmpty()) {
			set.add(Integer.toString(Integer.parseInt(prefix)));
		}
		
		if(remaining.isEmpty()) {
			return;
		}
		
		for(int i = 0; i < remaining.length(); i++) {
			
			dfs(prefix + remaining.charAt(i), remaining.substring(0,i) + remaining.substring(i+1));
		}
	}
    public int solution(String numbers) {
        int answer = 0;
        
        dfs("", numbers);
        
        for(String numStr : set) {
        	int num = Integer.parseInt(numStr);
        	if(isPrime(num)) {
        		answer++;
        	}
        }
        
        
        return answer;
    }
    
    public static boolean isPrime(int n) {
		if(n < 2) return false;
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		
		return true;
	}
}