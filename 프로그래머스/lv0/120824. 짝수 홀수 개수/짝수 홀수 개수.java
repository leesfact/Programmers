class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int odd = 0;
        int even = 0;
        
        for(int i : num_list){
            if(i % 2 == 0){
            even++; //2
            }else{
                odd++; //3
            }
        }
        answer[0] = even;
        answer[1] = odd;
    
        return answer;
    }  
    }
