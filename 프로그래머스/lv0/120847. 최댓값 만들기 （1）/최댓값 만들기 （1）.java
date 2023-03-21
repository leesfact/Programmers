class Solution {
    public int solution(int[] numbers) {
        
        int max = 0;
                
        
        for(int i = 0; i<numbers.length; i++){
            for(int j = 0; j<numbers.length; j++){
                if(i != j && numbers[j] * numbers[i] > max){
                    
                    max = numbers[j] * numbers[i];
                }
                  
            }
    }
        return max;
  }
}