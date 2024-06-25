class Solution {
    public String[] solution(String[] picture, int k) {
         String[] answer = new String[picture.length * k];
        
        for(int i = 0; i < answer.length; i ++) {
        	String pixcels = picture[i/k];
        	StringBuilder sb = new StringBuilder();
        	
    		for(int j = 0; j < picture[0].length(); j++) {
    			String kMag = String.valueOf(pixcels.charAt(j));
    			sb.append(kMag.repeat(k));
    		}
        	answer[i] = sb.toString();	
        	
        }
        
        return answer;
    }
}