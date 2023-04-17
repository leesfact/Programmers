class Solution {
    public int solution(int[] array) {
       int answer = 0;
        
        String str = "";
        for(int i = 0; i <  array.length; i++) {
        	str += Integer.toString(array[i]);
        }
        for(int i= 0; i < str.length(); i++) {
        	System.out.println(str.charAt(i));
        	if(str.charAt(i) == '7') {
        		answer++;
        	}
        }
        
        return answer;
    }
}