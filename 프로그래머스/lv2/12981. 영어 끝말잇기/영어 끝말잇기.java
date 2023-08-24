import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
       HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        HashSet<String> wordSet = new HashSet<>();
        
     
        for(int i = 0; i < words.length; i++) {
        	int person = i % n;
        	ArrayList<String> word = map.getOrDefault(person + 1, new ArrayList<>());
        	word.add(words[i]);
        	map.put(person + 1, word);
        }
        
        String prevWord = words[0];
        wordSet.add(prevWord);
      
        for (int i = 1; i < words.length; i++) {
        	
            if (prevWord.charAt(prevWord.length() - 1) != words[i].charAt(0) || wordSet.contains(words[i])) {
                return new int[] {(i % n) + 1, (i / n) + 1};
            }
            wordSet.add(words[i]);
            prevWord = words[i];
        }
        
        return new int[] {0, 0};
    }
}