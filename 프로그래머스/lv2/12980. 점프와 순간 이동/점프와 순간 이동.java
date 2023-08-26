import java.util.*;

public class Solution {
    public int solution(int n) {
        int charge = 1;
        
        while(n >= 2) {
        	
        	if(n % 2 ==0) {
        		
        		n /= 2;
        	}else {
        		n--;
        		charge++;
        	}
        }
        
       
        
       
        return charge;
    }
}