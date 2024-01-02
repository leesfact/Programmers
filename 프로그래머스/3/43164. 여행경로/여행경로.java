import java.util.*;
class Solution {
    static boolean[] visited;
	static List<String> answerList;
	
	
	public static void dfs(String[][] tickets, String current, LinkedList<String> route) {
		if (route.size() == tickets.length + 1) {
            answerList = new LinkedList<>(route);
            return;
        }
		
		for(int i = 0; i < tickets.length; i++) {
			if(!visited[i] && tickets[i][0].equals(current)) {
				visited[i] = true;
				route.add(tickets[i][1]);
				dfs(tickets, tickets[i][1], route);
				if (answerList != null) return;
                route.removeLast();
                visited[i] = false;
			}
		}
	}
	
	public static String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        Arrays.sort(tickets, Comparator.comparing((String[] ticket) -> ticket[0]).thenComparing(ticket -> ticket[1]));
        
        LinkedList<String> route = new LinkedList<>();
        route.add("ICN");
        
        dfs(tickets, "ICN", route);
        
      
        return answerList.toArray(new String[0]);
    }
}