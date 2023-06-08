class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int Pcnt = 0;
        int Ycnt = 0;

        String[] strCheck = s.split("");
        
        
        for(int i = 0 ; i < strCheck.length; i++) {
        	if (strCheck[i].equals("p") ||strCheck[i].equals("P")) {
        		Pcnt++;
        	}else if(strCheck[i].equals("y") ||strCheck[i].equals("Y")) {
        		Ycnt++;
        	}else {
        		answer = true;
        	}
        }
        if(Pcnt == Ycnt) {
        	answer = true;
        }else {
        	answer = false;
        }
        
    
        return answer;
    }
}