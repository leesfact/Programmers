import java.util.*;
class Solution {
    
    static ArrayList<int[]> hanoiList = new ArrayList<>();
    public static ArrayList<int[]> move(int n, int from, int to) {
		
		
		if(n > 1) {
			move(n - 1, from, 6 - from - to);
			
		}
		
		hanoiList.add(new int[] {from,to});
		if(n > 1) {
			move(n - 1, 6 - from - to, to);
		}
		
		
		return hanoiList;
		
	}
    public int[][] solution(int n) {
        hanoiList.clear();
		
        move(n,1,3);
        int[][] answer = new int[hanoiList.size()][2];
        for(int i = 0; i < hanoiList.size(); i++) {
        	answer[i] = hanoiList.get(i);
        }
        
        return answer;
    }
}