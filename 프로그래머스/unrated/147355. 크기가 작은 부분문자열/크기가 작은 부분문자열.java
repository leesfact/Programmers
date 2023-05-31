class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        for(int i = 0; i < t.length() - p.length() + 1; i++) {
        	String temp = t.substring(i, i+p.length());
        	System.out.println(temp);
        	if(Long.parseLong(temp) <= Long.parseLong(p)) {
        		answer++;
        	}
        }
        System.out.println(answer);
        return answer;
    }
}