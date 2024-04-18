class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[names.length % 5 == 0 ? (names.length/5) : (names.length/5) + 1];
        
        int cnt = 0;
        for(int i = 0; i < names.length; i += 5) {
        	answer[cnt++] = names[i];
        }
        
        return answer;
    }
}