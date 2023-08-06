class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int cnt = 0;
        int zeroCnt = 0;
        
        for(int i = 0; i < lottos.length; i++) {
        	if(lottos[i] == 0) {
        		zeroCnt++;
        	}
        }
        
        for(int i = 0; i < win_nums.length; i++) {
        	for(int j = 0; j < lottos.length; j++) {
        		if(win_nums[i] == lottos[j]) {
        			cnt++;
        		}
        	}
        }
        
        
       answer[0] = cnt + zeroCnt;
       answer[1] = cnt;
       
       for(int i = 0; i < answer.length; i++) {
    	  switch(answer[i]) {
    	  case 6:
    		  answer[i] = 1;
    		  break;
    	  case 5:
    		  answer[i] = 2;
    		  break;
    	  case 4:
    		  answer[i] = 3;
    		  break;
    	  case 3:
    		  answer[i] = 4;
    		  break;
    	  case 2:
    		  answer[i] = 5;
    		  break;
    	  default:
    		  answer[i] = 6;
    		  break;
    	  }
       }
       
      
       return answer;
    }
}