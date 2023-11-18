class Solution {
    public static long gcd(long a , long b) {
		while(b != 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		
		return a;
	}
	
	public static long solution(int w, int h) {
		
		long lw = (long) w;
		long lh = (long) h;
		
		long a = gcd(lw,lh);
		
		long answer = lw * lh - (lw + lh - a);

		
        return answer;
    }
}