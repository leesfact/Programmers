class Solution {
    public int solution(int n, int k) {
        
        int y = 0;
        int b = 0;
        int answer = 0;
        
        y = n * 12000;
        b = k * 2000;
        
        if(n / 10 > 0 ) {
            n /= 10;
            answer = y + b - (n*2000);
        }else{
            answer = y+b;
        }
       
        return answer;
    }
}