class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        for(int i = 0; i <= 10; i++) {
        	if(arr.length <= (int)Math.pow(2, i)) {
        		System.out.println(i);
        		answer = new int[(int)Math.pow(2, i)];
        		break;
        		
        	}
        }
        
        for(int i = 0; i < arr.length; i++) {
        	answer[i] = arr[i];
        }
        
        
        
        return answer;
    }
}