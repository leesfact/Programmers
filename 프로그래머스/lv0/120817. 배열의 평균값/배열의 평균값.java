class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        double answer = 0;
        for(int i = 0; i<numbers.length; i++){
            sum += numbers[i];
        }
        answer = sum/numbers.length;
        
        
        return answer;
    }
}