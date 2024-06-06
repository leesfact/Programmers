import java.util.*;
class Solution {
    public int solution(String[] strArr) {
         Map<Integer, Integer> bundle = new HashMap<>();
        for(String str : strArr) {
        	bundle.put(str.length(), bundle.getOrDefault(str.length(), 0)+1);
        }
        
        int max = 0;
        for(int a :bundle.values()) {
        	if(a > max) max = a;
        }
        
        return max;
    }
}