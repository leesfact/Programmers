import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < arr.length; i++) {
        	int cnt = arr[i];
        	if(flag[i]) {
        		cnt *= 2;
        		while(cnt > 0) {
        			stack.add(arr[i]);
        			cnt--;
        		}
        	}else {
        		while(cnt > 0) {
        			stack.pop();
        			cnt--;
        		}
        	}
        }
        
        int[] answer = new int[stack.size()];
        
        for(int i = stack.size() - 1; i >= 0; i--) {
        	answer[i] = stack.pop();
        }
        
        
        return answer;
    }
}