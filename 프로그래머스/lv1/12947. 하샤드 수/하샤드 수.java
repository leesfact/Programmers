class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = ""+x;
        int change = 0;
        for(int i = 0; i < str.length(); i++) {
        	change += Integer.parseInt(str.split("")[i]);        	
        }
        if(x % change ==0) {
        	answer = true;
        }else {
        	answer = false;
        }
        System.out.println(answer);
        return answer;
    }
}