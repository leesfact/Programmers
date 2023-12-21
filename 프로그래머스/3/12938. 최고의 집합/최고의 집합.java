import java.util.*;
class Solution {
    public int[] solution(int n, int s) {
        if(s < n) return new int[] {-1};
		
		int[] answer = new int[n];
		
		Arrays.fill(answer, s / n);
		
		int remainder = s % n;
		System.out.println(remainder);
		for(int i = n - 1; i >= n - remainder; i--) {
			answer[i]++;
		}
		
        return answer;
    }
}