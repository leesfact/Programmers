import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (ch >= 65 && ch <= 90) {
                answer += (char) (ch + 32);
            } else {
                answer += (char) (ch);
            }
        }

        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        String sortedAnswer = new String(chars);

        return sortedAnswer;
    }
}