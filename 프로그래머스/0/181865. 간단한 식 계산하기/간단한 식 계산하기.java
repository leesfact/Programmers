class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] set = binomial.split(" ");
        
        
        if(set[1].equals("+")) {
        	answer = Integer.parseInt(set[0]) + Integer.parseInt(set[2]);
        }else if(set[1].equals("-")) {
        	answer = Integer.parseInt(set[0]) - Integer.parseInt(set[2]);
        }else {
        	answer = Integer.parseInt(set[0]) * Integer.parseInt(set[2]);
        }
        
        return answer;
    }
}