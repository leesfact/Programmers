class Solution {
    public int solution(int n) {
       int answer = 0;
        int nOneCnt = 0;
        String binary = Integer.toBinaryString(n);
        
        for(char c : binary.toCharArray()) {
        	if(c == '1') {
        		nOneCnt++;
        	}
        }
        
     
        int a = n + 1;
        int nPlusOneCnt = 0;
        while(a > n) {
        	String s = Integer.toBinaryString(a);
        	for(char d : s.toCharArray()) {
        		if(d == '1') {
        			nPlusOneCnt++;
        		}
        	}
  
        	if(nOneCnt == nPlusOneCnt) {
        		answer = a;
        		break;
        	}
        	nPlusOneCnt = 0;
        	a++;
        }
        
        
        
        
        return answer;
    }
}