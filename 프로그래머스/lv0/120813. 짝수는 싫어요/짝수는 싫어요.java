class Solution {
    public int[] solution(int n) {
        int[] answer;
        int j = 0;
        
        if(n % 2 == 0){ // even
            answer = new int[n/2];
        }else{ //odd
            answer = new int[n/2+1];
        }
            
            
        for(int i = 0; i <= n; i++){
            
           if(i % 2 == 1){
               answer[j] = i;
               j++;
           }
            
        }
             
        return answer;
    }
}