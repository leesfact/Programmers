class Solution {
    public int solution(int n, int[] cores) {
       int answer = 0;
        int coreCount = cores.length;
        
        if (n <= coreCount) return n;
    
        int start = 1;
        int end = 10000 * n; 
        for (int core : cores) {
            end = Math.min(end, core * n);
        }
        int minTime = 0;
        int extraWork = 0; 
        
        
        while (start <= end) {
            int mid = (start + end) / 2;
            int work = calculateWork(mid, cores);
            
            if (work >= n) {
                end = mid - 1;
                minTime = mid;
                extraWork = work - n;
            } else {
                start = mid + 1;
            }
        }
        
        
        for (int i = coreCount - 1; i >= 0; i--) {
            if (minTime % cores[i] == 0) {
                if (extraWork == 0) {
                    answer = i + 1;
                    break;
                }
                extraWork--;
            }
        }
        
        return answer;
    }
    
    private static int calculateWork(int time, int[] cores) {
        int count = 0;
        for (int core : cores) {
            count += time / core + 1; 
        }
        return count;
    }
}