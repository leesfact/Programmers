class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] dic = my_string.split("");
        
        
        for(int indic : indices) {
        	dic[indic] = "";
        }
        
        for(int i = 0; i < dic.length; i++) {
        	if(dic[i] != "") {
        		answer += dic[i];
        	}
        }
       
        return answer;
    }
}