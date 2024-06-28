import java.util.*;
class Solution {
    public void generateCombinations(List<int[]> combinations, int[] distribution, int k, int remaining, int index) {
        if (index == k) {
            if (remaining == 0) {
                combinations.add(distribution.clone());
            }
            return;
        }
        
        for (int i = 1; i <= remaining + 1; i++) {
            distribution[index] = i;
            generateCombinations(combinations, distribution, k, remaining - (i - 1), index + 1);
        }
    }
    
    public int calculateWaitingTime(int[] mentors, int[][] reqs, int k) {
        int waitingTime = 0;
        PriorityQueue<Integer>[] queues = new PriorityQueue[k];
        for (int i = 0; i < k; i++) {
            queues[i] = new PriorityQueue<>();
        }
        
        for (int[] req : reqs) {
            int time = req[0];
            int duration = req[1];
            int type = req[2] - 1;
            
            PriorityQueue<Integer> queue = queues[type];
            if (queue.size() < mentors[type]) {
                queue.add(time + duration);
            } else {
                int startTime = queue.poll();
                waitingTime += Math.max(0, startTime - time);
                queue.add(Math.max(startTime, time) + duration);
            }
        }
        
        return waitingTime;
    }
    
    public int solution(int k, int n, int[][] reqs) {
        int answer = Integer.MAX_VALUE;
        int[] distribution = new int[k];
        Arrays.fill(distribution, 1);
        
        distribution[0] += n - k;
        
        List<int[]> combinations = new ArrayList<>();
        
        generateCombinations(combinations, distribution, k, n - k, 0);
        
        for (int[] comb : combinations) {
            int waitingTime = calculateWaitingTime(comb, reqs, k);
            answer = Math.min(answer, waitingTime);
        }
        
        return answer;
    }
}