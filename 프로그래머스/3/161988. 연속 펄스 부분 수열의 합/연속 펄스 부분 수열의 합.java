import java.util.*;
class Solution {
    public static long solution(int[] sequence) {
        long answer = Math.max(findMaxPulseSum(sequence,1), findMaxPulseSum(sequence,-1));
        
        return answer;
    }
	
	public static long findMaxPulseSum(int[] sequence,int startPulse) {
		
		long maxSoFar = 0;
		long maxEndingHere = 0;
		int pulse = startPulse;
		
		for(int i = 0; i < sequence.length; i++) {
			pulse *= -1;
			
			long currentVal = pulse * sequence[i];
			maxEndingHere += currentVal;
			
			if(maxEndingHere < 0) maxEndingHere = 0;
			
			if(maxSoFar < maxEndingHere) maxSoFar = maxEndingHere;
		}
		
		return maxSoFar;
	}
}