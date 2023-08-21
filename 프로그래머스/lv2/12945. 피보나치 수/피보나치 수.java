import java.util.*;
class Solution {
    public int solution(int n) {
        ArrayList<Integer> fibonacciList = new ArrayList<>();
		
		fibonacciList.add(0);
		fibonacciList.add(1);
		
		for(int i = 2; i <= n; i++) {
			int fibonacci = (fibonacciList.get(i - 2) + fibonacciList.get(i - 1)) % 1234567; 
			fibonacciList.add(fibonacci);
		}
		
		
		
		return fibonacciList.get(n);
    }
}