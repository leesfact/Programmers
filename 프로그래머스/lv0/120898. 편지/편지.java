class Solution {
    public int solution(String message) {
        int answer = 0;
        String[] letter = message.split("");
        
        for(int i = 0; i<letter.length;i++){
            answer++;
        }
        return answer*2;
    }
}