class Solution {
    public int solution(int[] array, int n) {
        
        //int[] array = {1,1,2,3,4,5};
        int cnt = 0;
       
        for(int i = 0; i<array.length; i++){
            if(n == array[i]){
                cnt++;
            }  
        }
        return cnt;
    }
}