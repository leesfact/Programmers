import java.util.*;
class Solution {
    public static int transform(String begin, String target, String[] words, boolean[] visited) {
		if(begin.equals(target)) return 0;
		
		int minSteps = Integer.MAX_VALUE;
		for (int i = 0; i < words.length; i++) {
            if (!visited[i] && oneCharDiff(begin, words[i])) {
                visited[i] = true;
                int steps = transform(words[i], target, words, visited);
                if (steps != Integer.MAX_VALUE) {
                    minSteps = Math.min(minSteps, steps + 1);
                }
                visited[i] = false;
            }
        }

        return minSteps;
	}
	
	public static boolean oneCharDiff(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) count++;
        }
        return count == 1;
    }
	

	
	public static int solution(String begin, String target, String[] words) {
        
		if(!Arrays.asList(words).contains(target)) return 0;
		
		boolean[] visited = new boolean[words.length];
		
		int steps = transform(begin, target, words, visited);
		
		System.out.println(steps);
		
        return steps == Integer.MAX_VALUE ? 0 : steps;
    }
}