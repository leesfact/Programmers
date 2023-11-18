class Solution {
    public static long gcd(int a , int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		
		return a;
	}
	
	public static long solution(int w, int h) {
		
		
		long a = gcd(w,h);
		
        long answer = (long)w * (long)h - ((long)w + (long)h - a);
        
        return answer;
    }
}