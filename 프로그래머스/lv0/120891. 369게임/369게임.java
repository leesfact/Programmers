class Solution {
    public int solution(int order) {
       int answer = 0;
        String[] str = Integer.toString(order).split("");
        int[] clab = new int[str.length];
        
        for(int i = 0; i <str.length; i++) {
        	clab[i] =  Integer.parseInt(str[i]);
        	
        	if(clab[i] != 0 && clab[i] % 3 ==  0) {
        		answer++;
        	}
        }
        return answer;
    }
}