class Solution {
    public String solution(String phone_number) {
       String[] number = phone_number.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < phone_number.length(); i++) {
        	if(i < number.length - 4) {
        		sb.append(number[i].replaceAll(number[i], "*")) ;
        	}else {
        		sb.append(number[i]);
        	}
        }
        
        return sb.toString();
    }
}