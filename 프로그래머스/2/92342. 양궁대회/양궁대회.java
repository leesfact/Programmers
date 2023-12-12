class Solution {
    
    static int MAX = 11;
    static int[] bestRyanList;
    static int bestScoreDiff = -1;
    
    public static void calculateScore(int[] info, int[] ryanList) {
		int apeachScore = 0;
	    int ryanScore = 0;
	        
        for(int i = 0; i < MAX; i++) {
            if(info[i] == 0 && ryanList[i] == 0) continue;
            
            if(info[i] >= ryanList[i]) apeachScore += (10 - i);
            else ryanScore += (10 - i);
        }
        
        int scoreDiff = ryanScore - apeachScore;
        if(scoreDiff > bestScoreDiff) {
            bestScoreDiff = scoreDiff;
            bestRyanList = ryanList.clone();
        } else if (scoreDiff == bestScoreDiff) {
            for(int i = MAX - 1; i >= 0; i--) {
                if(bestRyanList[i] != ryanList[i]) {
                    if(ryanList[i] > bestRyanList[i]) {
                        bestRyanList = ryanList.clone();
                    }
                    break;
                }
            }
        }
		
	}
    public static void search(int n , int[] info, int[] ryanList, int index) {
		if(n < 0) return; // 남은 화살이 없다면 더 이상 진행할 수 없
		
		if(index == MAX) { // 모든 점대를 고려했다면,
			ryanList[MAX - 1] += n; // 남은 모든 화살을 가장 낮은 점수대에 할
			calculateScore(info, ryanList); // 점수를 계
			ryanList[MAX - 1] -= n; // 백트래킹
			return;
		}
		
		search(n, info, ryanList, index +1); // 현재 점수대에 화살을 쏘지않고 다음 점수대 고
		 
		if(n > info[index]) { // 현재 점수대에 어피치보다 하나 더 많은 화살을 쏠 수 있다
			ryanList[index] = info[index] + 1; // 현재 점수대에 화살을 할당
			search(n - ryanList[index], info, ryanList, index + 1); // 할당 후 남은 화살로 다음 점수대를 고려
			ryanList[index] = 0; // 백트래킹
		}
		
	}
    public static int[] solution(int n, int[] info) {
        bestRyanList = new int[MAX];
        bestScoreDiff = -1;
        
        int[] ryanList = new int[MAX];
        
        search(n, info, ryanList, 0);
        
        
        
       
        if(bestScoreDiff == -1) return new int[] {-1};
        if(bestScoreDiff == 0) return new int[] {-1};
        else return bestRyanList;
        
        
  
    }
}