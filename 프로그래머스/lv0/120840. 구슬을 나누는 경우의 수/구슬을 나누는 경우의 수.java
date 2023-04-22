import java.math.BigInteger;
class Solution {
    public static BigInteger solution(int balls, int share) {
      
       BigInteger numerator = BigInteger.ONE;
       BigInteger denominator = BigInteger.ONE;
       
       for (int i = balls; i > balls - share; i--) {
           numerator = numerator.multiply(BigInteger.valueOf(i));
       }
       for (int i = share; i > 0; i--) {
           denominator = denominator.multiply(BigInteger.valueOf(i));
       }
       
       System.out.println(numerator.divide(denominator));
       return numerator.divide(denominator);
       
    }
}