class Solution {
    public static int convert(String time) {
		
		String[] nums = time.split(":");
		
		return (Integer.parseInt(nums[0]) * 3600) + (Integer.parseInt(nums[1]) * 60) + Integer.parseInt(nums[2]);
	}
	
	
	public static String solution(String play_time, String adv_time, String[] logs) {
        
        
        int playSec = convert(play_time);
        int advSec = convert(adv_time);
        int[] totalSec = new int[100 * 3600];
        
        for(String log : logs) {
        	int startTime = convert(log.split("-")[0]);
        	int endTime = convert(log.split("-")[1]);
        	
        	for(int i = startTime; i < endTime; i++) {
        		totalSec[i] += 1;
        	}
        }
        
        
        long cumulativeTimeSum = 0;
        
        
        
        long maxSum = cumulativeTimeSum;
        int maxIndex = 0;
        for(int i = advSec; i < playSec; i++) {
        	cumulativeTimeSum = cumulativeTimeSum + totalSec[i] - totalSec[i-advSec];
        	if(cumulativeTimeSum > maxSum) {
        		maxSum = cumulativeTimeSum;
        		maxIndex = i - advSec + 1;
        	}
        }
        
        return String.format("%02d:%02d:%02d", maxIndex/3600, maxIndex/60 % 60, maxIndex % 60);
    }
}