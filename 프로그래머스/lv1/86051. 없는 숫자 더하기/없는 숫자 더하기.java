import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Set<Integer>numSet = new HashSet<>();
        for(int i = 0; i < 10; i++) {
        	numSet.add(i);
        }
        for(int i = 0; i < numbers.length; i++) {
        	numSet.remove(numbers[i]);        	
        }
        
        for(Integer num : numSet) {
        	answer +=num;
        }
        return answer;
    }
}