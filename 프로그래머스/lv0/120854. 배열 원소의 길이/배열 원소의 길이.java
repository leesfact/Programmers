class Solution {
    public int[] solution(String[] strlist) {
        
        int[] strNum = new int[strlist.length];
        
        for(int i = 0 ; i<strlist.length; i++){
            
            strNum[i] = strlist[i].length();
        }
        return strNum ;
    }
}