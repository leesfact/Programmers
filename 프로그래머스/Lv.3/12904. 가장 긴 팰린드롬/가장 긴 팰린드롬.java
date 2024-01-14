class Solution
{
    public int solution(String s) {
        for (int answer = s.length(); answer > 1; answer--) {
            int start = 0;
            int end = 0 + answer - 1;

            while (end < s.length()) {
                if (isPalindrome(s, start, end)) {
                    return answer;
                }

                start++;
                end++;
            }
        }

        return 1;
    }

    private boolean isPalindrome(String s, int start, int end) {
        int diffBy2 = (end - start + 1) / 2 - 1;

        for (int i = 0; i <= diffBy2; i++) {
            char c1 = s.charAt(start + i);
            char c2 = s.charAt(end - i);

            if (c1 != c2) {
                return false;
            }
        }

        return true;
    }
    
}