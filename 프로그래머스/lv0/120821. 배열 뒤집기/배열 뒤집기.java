class Solution {
    public int[] solution(int[] num_list) {
        
        int[] reverse = new int[num_list.length];
        
        for(int i = 0; i<num_list.length;i++){ // 4~0까지
           
            reverse[i] = num_list[num_list.length -1 - i] ;  
        }
            
        return reverse;
    }
}