class Solution {
    public String solution(String bin1, String bin2) {
        String  answer = "";
		int num1 = Integer.parseInt(bin1, 2);
		int num2 = Integer.parseInt(bin2, 2);
		
        int binary = num1 + num2;
        
        answer = Integer.toBinaryString(binary);
        return answer;
    }
}