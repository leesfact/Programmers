class Solution {
    public int solution(int n) {
      StringBuilder sb = new StringBuilder();
        

        while(n != 0){
            sb.append(n % 3);
            n /= 3;
        }
        
        String base3 = sb.toString();

        int answer = 0;
        for (int i = base3.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(base3.charAt(i));
            int power = base3.length() - 1 - i;
            answer += digit * Math.pow(3, power);
        }
        
        System.out.println("Number in base 10: " + answer);
        
        return answer;
    }
}