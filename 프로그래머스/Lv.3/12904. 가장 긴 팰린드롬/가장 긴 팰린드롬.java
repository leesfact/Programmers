class Solution
{
    public int solution(String s)
    {
       int answer = 0;
        for(int start = 0, end = s.length(); start < end; start++) {
            int startIndex = start;
            int endIndex = end - 1;
            int maxCount = end - start;
            int searchLastIndex = -1;
            if(answer >= maxCount) break;
            while(endIndex > startIndex) {
                char ch1 = s.charAt(startIndex);
                char ch2 = s.charAt(endIndex);
                if(ch1 == ch2) {
                    if(searchLastIndex == -1)
                        searchLastIndex = endIndex;
                    startIndex++;
                    endIndex--;
                } else {
                    if(searchLastIndex == -1) 
                        endIndex--;
                    else {
                        startIndex = start;
                        endIndex = searchLastIndex - 1;
                        searchLastIndex = -1;
                    }
                    maxCount--;
                }
            }
            answer = answer < maxCount ? maxCount : answer;
        }
        return answer;
    }
}