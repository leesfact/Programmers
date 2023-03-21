class Solution {
    public String solution(String rsp) {
        String answer = "";
	        for(int i = 0; i < rsp.length(); i++) {
	        	if(rsp.charAt(i)=='5') {
	        		answer +='2';
	        	}else if(rsp.charAt(i) == '0') {
	        		answer +='5';
	        	}else {
	        		answer +='0';
	        	}
	        }
	        return answer;
    }
}