class Solution {
    public int solution(int num, int k) {
       String strNum = num + "";
        String digit = k + "";
        
        if(strNum.indexOf(digit) == -1){
            
            return -1;
        }else{
            return strNum.indexOf(digit)+1;
        }

        
    }
}

    