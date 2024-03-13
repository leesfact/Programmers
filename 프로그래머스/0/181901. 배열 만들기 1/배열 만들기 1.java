class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        
        int cnt = 0;
		for(int i = 1; i <= n; i++) {
			int num = i * k;
			if(num <= n) {
				answer[cnt++] = num;
			}
		}
		
        return answer;
    }
}