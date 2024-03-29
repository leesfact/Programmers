class Solution {
    public int solution(int a, int b) {
        StringBuilder ab = new StringBuilder();
        StringBuilder ba = new StringBuilder();
        
        ab.append(Integer.toString(a)+Integer.toString(b));
        ba.append(Integer.toString(b) + Integer.toString(a)); 
        return Integer.parseInt(ab.toString()) >= Integer.parseInt(ba.toString()) ? Integer.parseInt(ab.toString()) :Integer.parseInt(ba.toString());
    }
}