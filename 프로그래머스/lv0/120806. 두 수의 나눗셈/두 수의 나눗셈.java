class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double casting = 0;
        casting = (double)num1/(double)num2 ;
        
        answer = (int)(casting*1000);
        return answer;
    }
}