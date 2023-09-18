class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i <= t*m; i++) {
			sb.append(Integer.toString(i, n).toUpperCase());
		}
		
		StringBuilder result = new StringBuilder();
		
		int i = p - 1;
		for(int j = 0; j < t; j++) {
		    result.append(sb.charAt(i));
		    i += m;
		}
		
		
		
        return result.toString();
    }
}