class Solution {
    public String solution(String n_str) {
        int idx = 0;
        
        while(idx < n_str.length() && n_str.charAt(idx) == '0') {
        	idx++;
        }
        System.out.println(idx);
        
        return n_str.substring(idx);
    }
}