class Solution {
    public static int[] solution(long begin, long end) {
		int[] answer = new int[(int)(end - begin) + 1];
        
		for (int i = 0; i < answer.length; i++) {
			long blockNumber = begin + i;
			
			
			for (long j = 2; j * j <= blockNumber; j++) {
				if (blockNumber % j == 0) {
					if(blockNumber / j > 10000000) {
						answer[i] = (int) j;
						continue;
					}else {
						answer[i] = (int) (blockNumber / j);
					}
					break;
				}
			}
			if(answer[i] == 0) answer[i] = 1;		
		}
		if(begin == 1) answer[0] = 0;
		
		return answer;
	}
}