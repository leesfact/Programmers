class Solution {
    public int solution(int a, int b) {
        
        return Integer.parseInt(Integer.toString(a) + Integer.toString(b)) >= 2*a*b ? Integer.parseInt(Integer.toString(a) + Integer.toString(b)) : 2*a*b;
    }
}