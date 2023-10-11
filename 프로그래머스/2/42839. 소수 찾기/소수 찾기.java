import java.util.*;
class Solution {
    static Set<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        for (int i = 1; i <= numbers.length(); i++) {
            dfs("", numbers, i);
        }
        System.out.println(set);
        for (int num : set) {
            if (isPrime(num)) {
                answer++;
            }
        }
        return answer;
    }
    
    public static void dfs(String prefix, String str, int k) {
        if (prefix.length() == k) {
            set.add(Integer.parseInt(prefix));
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            dfs(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1), k);
        }
    }
	
	public static boolean isPrime(int n) {
		
		if(n < 2) return false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
		
	}
}