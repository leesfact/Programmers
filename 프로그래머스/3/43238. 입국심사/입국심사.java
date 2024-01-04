class Solution {
    public static long getMax(int[] times) {
		long max = 0;
		for(int time : times) {
			if(time > max) {
				max = time;
			}
		}
		
		
		return max;
	}
	
	
	public static long solution(int n, int[] times) {
		long left = 1;
		long right = (long)n * getMax(times);
        long answer = right;
        
        while(left <= right) {
        	long mid = (left + right) / 2;
        	long sum = 0;
        	
        	for(int time : times) {
        		sum += mid / time;
        		
        	}
        	
        	if(sum >= n) {
        		answer = Math.min(answer, mid);
        		right = mid - 1;
        	}else {
        		left = mid + 1;
        	}
        }
        return answer;
    }
}