class Solution {
public static int[] solution(long begin, long end) {
		int[] answer = new int[(int)(end - begin) + 1];

	        for (int i = 0; i < answer.length; i++) {
	            long blockNumber = begin + i;

	            if (blockNumber == 1) {
	                answer[i] = 0; 
	                continue;
	            }

	            answer[i] = 1; 

	            for (long j = 2; j * j <= blockNumber; j++) {
	                if (blockNumber % j == 0) {
	                    long divisor = blockNumber / j;
	                    if (divisor <= 10000000) {
	                        answer[i] = (int)divisor; 
	                        break;
	                    }else {
	                    	answer[i] = (int)j;
	                    }
	                }
	            }
	        }

	        return answer;
	}
}