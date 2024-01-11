import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        long answer = Integer.MAX_VALUE;

        Arrays.sort(times);

        long left = 0;
        long right = times[times.length-1] * (long)n;

        int num=1;
        while(left <= right){
            long mid = (left + right) / 2;
            

            long finish = 0;
            for(int time : times){
                finish += mid / (long)time;
            }

            if(finish < n){
                left = mid+1;
            }else{
                
                answer = mid;
              
                right = mid-1;
            }
        }

        return answer;
    }
}