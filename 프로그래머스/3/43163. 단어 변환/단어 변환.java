import java.util.*;
class Solution {
    static class Pair {
		String word;
		int depth;
		
		public Pair(String word, int depth) {
			
			this.word = word;
			this.depth = depth;
			
		}
	}
	
	public static boolean canTransform(String word1, String word2) {
		int count = 0;
		
		for(int i = 0; i < word1.length(); i++) {
			if (word1.charAt(i) != word2.charAt(i)) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
		}
		
		return count == 1;
	}
	
	
	

	
	public static int solution(String begin, String target, String[] words) {
        
		if(!Arrays.asList(words).contains(target)) return 0;
		
		Queue<Pair> queue = new LinkedList<>();
		
		boolean[] visited = new boolean[words.length];
		
		queue.add(new Pair(begin, 0));
		
		while(!queue.isEmpty()) {
			Pair current = queue.poll();
			String currentWord = current.word;
			int currentDepth = current.depth;
			
			if(currentWord.equals(target)) {
				return currentDepth;
			}
			
			 for (int i = 0; i < words.length; i++) {
	                if (!visited[i] && canTransform(currentWord, words[i])) {
	                    visited[i] = true;
	                    queue.add(new Pair(words[i], currentDepth + 1));
	                }
            }
			 
        }
        return 0;
    }
}