import java.util.*;
class Solution {
    public int solution(int left, int right) {
       int answer = 0;
	        int cnt = 0; 
	        ArrayList<Integer> factors = new ArrayList<>();
	      
	        for(int i = left; i <= right; i++) {
	        		while(cnt <= i) {
	        			cnt++;
	        			if((i % cnt) == 0) {
	        				factors.add(cnt);
	        			}		
	        		}
	        		System.out.println(factors);
	        		if(factors.size() % 2 == 0) {
	        			answer +=i;
	        		}else {
	        			answer -=i;
	        		}
	        		factors.clear();
	        		cnt = 0;
	        }
	        return answer;
    }
}