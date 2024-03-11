class Solution {
    public int solution(int[] numbers, int n) {
        
        
        int sum = 0;
        for(int number : numbers){
            if(sum > n){
                break;
            }
            sum += number;
        }
        return sum;
    }
}