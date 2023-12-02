import java.util.*;
class Solution {
    static boolean[] visitedBox;
    static int[] box;
    static ArrayList<Integer> groupList = new ArrayList<>();
    
    
    public static void dfs(int index) {
		
		if(visitedBox[index]) return;
	
		int cnt = 0;
		while(!visitedBox[index]) {
			visitedBox[index] = true;
			cnt++;
			index = box[index];
		}
		groupList.add(cnt);
		
		
		
	}
	
	public static int solution(int[] cards) {
		
		int N = cards.length;
		box = new int[N+1];
		visitedBox = new boolean[N+1];
		
		for(int i = 1; i <= N; i++) {
			box[i] = cards[i-1];
		}
		
		for(int i = 1; i <= N; i++) {
			dfs(i);	
		}
		
		
        Collections.sort(groupList, Collections.reverseOrder());
        
        if(groupList.size() < 2) return 0;
        int answer = groupList.get(0) * groupList.get(1);
        
        return answer;
    }
}