class Solution {
    public int solution(int hp) {
        int a = hp / 5;
        int b = (hp % 5) / 3 ;
        int c = ((hp % 5) % 3);
        return a+b+c;
    }
}