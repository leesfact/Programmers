import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
       
        Arrays.sort(A);
        Arrays.sort(B);

        
        int i = A.length - 1; 
        int j = B.length - 1; 
        
       
        while (i >= 0 && j >= 0) {
            if (B[j] > A[i]) { 
                answer++; 
                j--; 
            }
            i--; 
        }
        
       
        return answer; 
    }
}