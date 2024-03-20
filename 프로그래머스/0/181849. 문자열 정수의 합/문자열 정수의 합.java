class Solution {
    public int solution(String num_str) {
        int sum = 0;
        String[] numList = num_str.split("");
        
        for(String num : numList) {
        	sum += Integer.parseInt(num);
        }
        
        return sum;
    }
}