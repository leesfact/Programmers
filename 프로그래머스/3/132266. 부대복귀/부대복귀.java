import java.util.*;
class Solution {
    static int[] dist;
    static List<Node>[] list;

    public int[] solution(int n, int[][] roads, int[] sources, int destination){
        int[] answer = new int[sources.length];

        dist = new int[n+1];
        list = new List[n+1];

        for(int i=1; i<=n; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        for(int i=1; i<=n; i++) {
            list[i] = new ArrayList<>();
        }

        for(int i=0; i<roads.length; i++) {
            list[roads[i][0]].add(new Node(roads[i][1], 1));
            list[roads[i][1]].add(new Node(roads[i][0], 1));
        }

        bfs(destination);

        for(int i=0; i<sources.length; i++) {
            if(dist[sources[i]] == Integer.MAX_VALUE) {
                answer[i] = -1;
            } else {
                answer[i] = dist[sources[i]];
            }
        }

        return answer;
    }

    static void bfs(int start) {
        PriorityQueue<Node> queue = new PriorityQueue<>(
            (o1, o2) -> o1.u - o2.u);

        dist[start] = 0;
        queue.offer(new Node(start, dist[start]));

        while(!queue.isEmpty()) {
            Node now = queue.poll();

            for(Node next : list[now.v]) {

                if(dist[next.v] > now.u + next.u) {
                    dist[next.v] = now.u + next.u;
                    queue.offer(new Node(next.v, dist[next.v]));
                }
            }
        }

    }

    static class Node {
        int v;
        int u;

        public Node(int v, int u) {
            this.v = v;
            this.u = u;
        }
    }

}