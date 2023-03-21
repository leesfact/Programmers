class Solution {
    public int solution(int n) {
        
        int piece  = 7;
        int answer = 0;
        
        if(n % piece == 0){
            answer = n / piece ;
        }else{
            answer = (n / piece) + 1;
        }
        
        return answer;
    }
}