import java.util.*;
class Solution {
    
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static int[] solution(int n, long k) {
       List<Integer> numbers = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
        	numbers.add(i);
        }
        
       
        int[] answer = new int[n];
        k--;
        
        for(int i = 0; i < n; i++) {
        	long fact = factorial(n - i - 1);
        	int index = (int) (k / fact);
        	answer[i] = numbers.remove(index);
        	k %= fact;
        	
        }
      
        return answer;
    }
}