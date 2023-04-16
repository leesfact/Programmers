class Solution {
    public int solution(String s) {
       int answer = 0;
        String[] str = s.split(" ");

        
        for(int i = 0; i < str.length; i++) {
        	System.out.println(str[i]);
            if("Z".equals(str[i])) {
        		answer -= Integer.parseInt(str[i-1]);
            	
            }else {
            	answer += Integer.parseInt(str[i]);
            }
        }
      
        return answer;
    }
}