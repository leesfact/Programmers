class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multi = 1;
        for(int num : num_list){
            sum += num;
            multi *= num;
            
           
        }
       
        if(multi <= (int)Math.pow(sum,2)) {
            return 1;
        }
        return 0;
    }
}