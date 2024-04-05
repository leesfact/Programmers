class Solution {
    public String solution(String my_string, String alp) {
        for(int i = 0; i < my_string.length(); i++) {
	        	
	        	if(my_string.charAt(i) == alp.charAt(0)) {
	        		my_string = my_string.replace(alp.charAt(0), alp.toUpperCase().charAt(0));
	        	}
	        	
	        }
	       
	        return my_string;
    }
}