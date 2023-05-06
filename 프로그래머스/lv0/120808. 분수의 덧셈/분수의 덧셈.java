class Solution {
     public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int commonDenominator = denom1 * denom2;
        int sumNumerator = (numer1 * denom2) + (numer2 * denom1);
        int gcd = findGCD(sumNumerator, commonDenominator);

        return new int[] {sumNumerator / gcd, commonDenominator / gcd};
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}