class Solution {
    public static String solution(String my_string) {
        String answer = my_string.replaceAll("[aeiou]", "");
        System.out.println(answer);
        return answer;
    }
}