import java.util.*;
class Solution {
    public static long solution(int[] sequence) {
        long answer = Math.max(findMaxPulseSum(sequence,1), findMaxPulseSum(sequence,-1));
        
        
        return answer;
    }
	
	public static long findMaxPulseSum(int[] sequence,int startPulse) {
		
		long maxSoFar = startPulse * sequence[0];
		long maxEndingHere = startPulse * sequence[0];
		int pulse = startPulse;
		
		for(int i = 1; i < sequence.length; i++) {
			pulse *= -1;
			
			long currentVal = pulse * sequence[i];
			maxEndingHere = Math.max(currentVal, maxEndingHere + currentVal);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		
		return maxSoFar;
	}
}