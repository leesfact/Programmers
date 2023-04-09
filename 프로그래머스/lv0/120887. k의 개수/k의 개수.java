class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String intStr = "";
        String convert = Integer.toString(k);
        
        for(int v = i; v <=j; v++) {
        	intStr +=Integer.toString(v);	
        }
        String[] strArr = intStr.split("");

        
        for(int z = 0; z < strArr.length; z++) {
        	if(strArr[z].equals(convert)) {
        		answer++;
        	}
        }
        return answer;
    }
}