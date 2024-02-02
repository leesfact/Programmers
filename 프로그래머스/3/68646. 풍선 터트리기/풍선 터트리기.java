import java.util.*;
class Solution {
    public int solution(int[] a) {
        int leftMin = Integer.MAX_VALUE;
        int rightMin = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < a.length; i++) {
        	leftMin = Math.min(leftMin, a[i]);
        	rightMin = Math.min(rightMin, a[a.length-1-i]);
        	set.add(leftMin);
        	set.add(rightMin);
        }
        
       
        
        
        return set.size();
    }
}