class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

	        for (int i = 0; i < numbers.length; i++) {
	            
	            if (numbers[i] % 2 == 0) {
	                answer[i] = numbers[i] + 1;
	            } else {
	               
	                String binaryString = Long.toBinaryString(numbers[i]);

	               
	                if (!binaryString.contains("0")) {
	                    binaryString = "10" + binaryString.substring(1);
	                } else {
	                   
	                    int lastZeroIndex = binaryString.lastIndexOf("0");
	                    int nextOneIndexAfterZero = binaryString.indexOf("1", lastZeroIndex);

	                    
	                    binaryString = binaryString.substring(0, lastZeroIndex) + "1" +
	                            "0" + binaryString.substring(nextOneIndexAfterZero + 1);
	                }

	                
	                answer[i] = Long.parseLong(binaryString, 2);
	            }
	        }

	        return answer;
    }
}