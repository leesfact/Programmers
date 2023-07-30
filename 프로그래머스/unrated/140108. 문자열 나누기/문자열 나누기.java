class Solution {
    public int solution(String s) {
        int answer = 0;
        int i = 0, j = 0, len = s.length();
        int countTarget = 0, countOther = 0;
        while (i < len && j < len) {
            char target = s.charAt(i);
            if (s.charAt(j) == target) {
                countTarget++;
            } else {
                countOther++;
            }
            if (countTarget == countOther) {
                answer++;
                i = j + 1;
                countTarget = 0;
                countOther = 0;
            }
            j++;
        }
        if (i < len) answer++;
        return answer;
    }
}