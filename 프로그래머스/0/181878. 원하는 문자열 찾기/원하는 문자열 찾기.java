class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        if(pat.length() > myString.length()) return 0;
        
       
        
        return myString.contains(pat) ? 1 : 0;
    }
}