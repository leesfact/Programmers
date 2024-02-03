import java.util.*;
class Solution {
    public static final int INF = 10_000_000;

    public static int[] solution(int n, int[][] roads, int[] sources, int destination) {
        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] road : roads) {
            int a = road[0];
            int b = road[1];
            graph.get(a).add(new Node(b, 1));
            graph.get(b).add(new Node(a, 1));
        }

        int[] shortestPaths = dijkstra(graph, destination, n);

        int[] answer = new int[sources.length];
        for (int i = 0; i < sources.length; i++) {
            int distance = shortestPaths[sources[i]];
            answer[i] = distance == INF ? -1 : distance;
        }

        return answer;
    }

    public static int[] dijkstra(ArrayList<ArrayList<Node>> graph, int start, int n) {
        int[] distances = new int[n + 1];
        Arrays.fill(distances, INF);
        distances[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int currentNode = current.vertex;
            int currentDistance = current.cost;

            if (distances[currentNode] < currentDistance) {
                continue;
            }

            for (Node node : graph.get(currentNode)) {
                int cost = currentDistance + node.cost;
                if (cost < distances[node.vertex]) {
                    distances[node.vertex] = cost;
                    pq.offer(new Node(node.vertex, cost));
                }
            }
        }

        return distances;
    }

    static class Node {
        int vertex;
        int cost;

        Node(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }
    }
}