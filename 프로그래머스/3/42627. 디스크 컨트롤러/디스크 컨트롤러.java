import java.util.*;
class Solution {
   static class Job {
		int request;
		int period;
		
		public Job(int request, int period) {
			this.request = request;
			this.period = period;
		}
	}
	
    public static int solution(int[][] jobs) {
    	
        Arrays.sort(jobs, Comparator.comparingInt(o -> o[0]));
        
        
        PriorityQueue<Job> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.period));
        
        int time = 0;
        int sum = 0;
        int jobsIndex = 0;
        int count = 0; 
        
       
        while (count < jobs.length) {
            
            while (jobsIndex < jobs.length && jobs[jobsIndex][0] <= time) {
                pq.add(new Job(jobs[jobsIndex][0], jobs[jobsIndex][1]));
                jobsIndex++;
            }
            
          
            if (!pq.isEmpty()) {
                Job job = pq.poll();
                time += job.period; 
                sum += time - job.request;
                count++; 
            } else {
               
                time = jobs[jobsIndex][0];
            }
        }
        
        return sum / jobs.length; 
    }
}