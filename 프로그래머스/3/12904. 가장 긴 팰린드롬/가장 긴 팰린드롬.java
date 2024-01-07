class Solution
{
    public int solution(String s)
    {
       int n = s.length();
		boolean[][] dp = new boolean[n][n];
		int maxLength = 1;
		
		
		// 한 글자는 모두 팰린드롬
		for(int i = 0; i < n; i++) {
			dp[i][i] = true;
		}
		
		// 두 글자 팰린드롬
		for(int i = 0; i < n - 1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				dp[i][i + 1] = true;
				maxLength = 2;
			}
		}
		
		// 길이가 3 이상인 팰린드롬 확인
		
		for(int len = 3; len <= n; len++) {
			for(int start = 0; start <= n - len; start++) {
				int end = start + len - 1;
				if (s.charAt(start) == s.charAt(end) && dp[start + 1][end - 1]) {
                    dp[start][end] = true;
                    maxLength = len;
                }
			}
		}
		
		return maxLength;
    }
}