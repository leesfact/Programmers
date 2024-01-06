class Solution
{
    public static boolean isPalindrome(String s, int start, int end) {
		
		while(start < end) {
			if(s.charAt(start) != s.charAt(end)){
				return false;
			}
			
			start++;
			end--;
		}
		
		return true;
	}
	
	
	
	public static int solution(String s) {
      
		int maxLength = 0;
		
		for(int start = 0; start < s.length(); start++) {
			for(int end = s.length() - 1; end >= start; end--) {
				if(s.charAt(start) == s.charAt(end) && isPalindrome(s, start, end)) {
					maxLength = Math.max(maxLength, end - start + 1);
				}
			}
			
		}
		
		return maxLength;
    }
}