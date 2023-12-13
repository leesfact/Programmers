class Solution {
    
    
	static int[] bestRyanList;
	static int[] ryanList;
	static int MAX = 11;
	static int bestScoreDiff = Integer.MIN_VALUE;
	
	public static int[] solution(int n, int[] info) {
        
		ryanList = new int[MAX];
		bestRyanList = new int[MAX];
		
		backtracking(0,n,info);
		
		
		
		if(bestScoreDiff <= 0) return new int[] {-1};
        else return bestRyanList;
  
    }
	
	public static void backtracking(int depth, int n, int[] info) {
		
		
		if(depth == n) {
			int diff = score(info);
			if(diff >= bestScoreDiff) {
				bestScoreDiff = diff;
				bestRyanList = ryanList.clone();
			}
			return;
		}
		
		for(int i = 0; i < info.length && ryanList[i] <= info[i]; i++) {
			ryanList[i] += 1;
			backtracking(depth + 1, n, info);
			ryanList[i] -=1;
		}
	}
	
	public static int score(int[] info) {
		int apeachScore = 0, ryanScore = 0;
		
		for(int i = 0; i < ryanList.length; i++) {
			if(info[i] == 0 && ryanList[i] == 0) continue;
			if(info[i] >= ryanList[i]) apeachScore += (10 - i);
			else ryanScore += (10 - i);
		}
		
		
		int diff = ryanScore - apeachScore;
    	if(diff <= 0) return -1;
    	return diff;
	}
}