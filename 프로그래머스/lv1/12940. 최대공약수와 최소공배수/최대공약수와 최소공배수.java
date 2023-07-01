class Solution {
    public int[] solution(int n, int m) {
        int gcd = gcd(n,m);
		int lcm = lcm(n,m,gcd);
        int[] answer = {gcd,lcm};
        return answer;
    }
    
    public int gcd(int n, int m ){
        if(m == 0){
            return n;
        }else{
            return gcd(m, n % m);
        }
    }
    
    public int lcm(int n, int m , int gcd){
        return (n * m) / gcd;
    }
}