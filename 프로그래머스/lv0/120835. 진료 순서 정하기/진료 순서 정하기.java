import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] down = new int[emergency.length];
        
        for(int i = 0; i < emergency.length; i++) {
        	down[i] = emergency[i];
        }
    
        Arrays.sort(down);
       
        for(int i = 0; i < emergency.length; i++) {
        	for(int j = 0; j < emergency.length;j++) {
        		if(down[i] == emergency[j]) {
        			answer[j] = emergency.length-i;
        		}
        	}
        }
        return answer;
    }
}