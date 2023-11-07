import java.util.*;
class Solution {
    
    static Map<Integer, List<int[]>> graph;
    static int[] dist;
    public static void dijkstra(int start){
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a -> a[1]));
        pq.offer(new int[] {start, 0});
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        
        while(!pq.isEmpty()){
        
        int[] current = pq.poll();
        int currentNode = current[0];
        int currentDistance = current[1];
        
        if(dist[currentNode] < currentDistance) continue;
            
        List<int[]> neighbors = graph.getOrDefault(currentNode, new ArrayList<>());
            
        for(int[] neighbor : neighbors){
            int nextNode = neighbor[0];
            int nextDistance = currentDistance + neighbor[1];
            
            if(nextDistance < dist[nextNode]){
                dist[nextNode] = nextDistance;
                pq.offer(new int[] {nextNode, nextDistance});
            }
        }
        
       } 
    }
    public int solution(int N, int[][] road, int K) {
        
        graph = new HashMap<>();
        dist = new int[N+1];
        
        for(int[] edge : road){
            int start = edge[0];
            int end = edge[1];
            int distance = edge[2];
            
            graph.computeIfAbsent(start, k -> new ArrayList<>()).add(new int[] {end, distance});
			graph.computeIfAbsent(end, k -> new ArrayList<>()).add(new int[] {start, distance});
        }
        
        dijkstra(1);
		
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            if (dist[i] <= K) answer++;
        }

        return answer;
    }
}