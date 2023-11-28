class Solution {
    public static String compressString(String s, int len) {
		
		StringBuilder compressed = new StringBuilder();
		String pattern = "";
		int count = 1;
		
		for(int i = 0; i < s.length(); i += len) {
			String next = s.substring(i, Math.min(i+len, s.length()));
			
			if(next.equals(pattern)) {
				count++;
			}else {
				if(count > 1) {
					compressed.append(count);
				}
				compressed.append(pattern);
				pattern = next;
				count = 1;
			}
		}
		
		if(count > 1) {
			compressed.append(count);
		}
		compressed.append(pattern);
		
		return compressed.toString();
	}
	
	public static int solution(String s) {
		
		
		if(s.length() == 1) return 1;
		
		int answer = s.length();
		
		for(int i = 1; i <= s.length() / 2 ; i++) {
			int compressLength = compressString(s, i).length();
			answer = Math.min(answer, compressLength);
		}
        
        
        return answer;
    }
}