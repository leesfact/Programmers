class Solution {
    public int solution(String my_string, String is_suffix) {
        for(int i = 0; i < my_string.length(); i++) {
        	String temp = my_string.substring(i, my_string.length());
        	if(temp.equals(is_suffix)) {
        		return 1;
        	}
        }
        return 0;
    }
}