import java.util.*;
class Solution {
    static Map<String, PriorityQueue<String>> graph;
	static List<String> route;
	static boolean found;
	
	public void dfs(String depart) {
		PriorityQueue<String> arrival = graph.get(depart);
		
		
		
		while(arrival != null && !arrival.isEmpty()) {
			dfs(arrival.poll());
		}
		
		route.add(0, depart);
		System.out.println(route);
	}
	
	public String[] solution(String[][] tickets) {
        graph = new HashMap<>();
        route = new LinkedList<>();
        
        for(String[] ticket : tickets) {
        	graph.putIfAbsent(ticket[0], new PriorityQueue<>());
        	graph.get(ticket[0]).add(ticket[1]);
        }
        
        
        dfs("ICN");
        
       
        
        
        return route.toArray(new String[0]);
    }
}