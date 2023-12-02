import java.util.*;
class Solution {
    static int[] box;
	static ArrayList<Integer> groupList = new ArrayList<>();
	
	public static void dfs(int index) {
		
		
	
		int cnt = 0;
		while(box[index] != -1) {
			int nextIndex = box[index];
			box[index] = -1;
			index = nextIndex;
			cnt++;
		}
		if(cnt > 0) {
			groupList.add(cnt);			
		}
		
		
		
	}
	
	public static int solution(int[] cards) {
		
		int N = cards.length;
		box = new int[N+1];
		
		
		for(int i = 1; i <= N; i++) {
			box[i] = cards[i-1];
		}
		
		for(int i = 1; i <= N; i++) {
			if(box[i] != -1) {
				dfs(i);					
			}
		}
			
		
        Collections.sort(groupList, Collections.reverseOrder());
        
        if(groupList.size() < 2) return 0;
        int answer = groupList.get(0) * groupList.get(1);
        
        return answer;
    }
}