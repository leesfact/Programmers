import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        ArrayList<Integer> value = new ArrayList<>();
        while(true) {
        	cnt++;
        	if( n % cnt == 0) {
        		System.out.println(cnt);
        		value.add(cnt);	
        	}else if (cnt > n) {
        		break;
        	}	
        }
        int[] answer = new int[value.size()];
        for(int i = 0; i<value.size(); i++) {
        	answer[i]= value.get(i);
        }
        return answer;
    }
}