class Solution
{
   public static int expand(String s, int left, int right) {
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		
		return right - left - 1;
	}
	
	public static int solution(String s) {
      
		if (s.length() == 1) return 1; 
		
		int start = 0, end = 0;
		
		for(int i = 0; i < s.length(); i++) {
			int oddLength = expand(s, i, i);
			int evenLength = expand(s,i, i+1);
			int len = Math.max(oddLength, evenLength);
			if(len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
	

        
		return end - start + 1;
    }
}