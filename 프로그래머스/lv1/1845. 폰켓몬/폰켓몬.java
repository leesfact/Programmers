import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i< nums.length; i++) {
        	set.add(nums[i]);
        }
        
        System.out.println(set);
        int answer = (nums.length / 2) ;
        
        if(answer > set.size()) {
        	answer = set.size();
        }
        
        System.out.println(answer);
        return answer;
    }
}