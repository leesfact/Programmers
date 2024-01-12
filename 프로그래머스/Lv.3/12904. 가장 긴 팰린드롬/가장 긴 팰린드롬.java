class Solution
{
    public int solution(String str)
    {
       int answer = 1; 

        int start = 0;
        int len = str.length();

        int low, high;

        for(int i = 1; i < len; ++i) {
            low = i - 1;
            high = i;
            while(low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > answer) {
                    start = low;
                    answer = high - low + 1;
                }
                --low;
                ++high;
            }

            low = i - 1;
            high = i + 1;
            while(low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > answer) {
                    start = low;
                    answer = high - low + 1;
                }
                --low;
                ++high;
            }
        }

        return answer;
    }
}