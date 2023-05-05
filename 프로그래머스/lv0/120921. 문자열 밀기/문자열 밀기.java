class Solution {
    public int solution(String A, String B) {
       int answer = -1;
        String[] strArray = new String[A.length()];
        int length = A.length();
        if(A.equals(B)) {
        	return 0;
        }else {
        	A +=A;
        	for(int i = 0; i < length; i++ ) {
        		strArray[i] = A.substring(i,i+length);
        		System.out.println(strArray[i]);
        		if(strArray[i].equals(B)) {
        			answer = Math.abs(i-length);
        		}
        	}
        }
        
        return answer;
    }
}