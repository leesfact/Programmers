class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i = 0; i < my_string.length(); i++) {
        	int c = my_string.charAt(i) - 0 < 91 ? my_string.charAt(i) - 65 : my_string.charAt(i) - 71;
        	
        	answer[c]++;
        }
        
        
        return answer;
    }
}