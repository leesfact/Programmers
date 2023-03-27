class Solution {
    public int[] solution(int[] array) {
       int a = 0;
        int[] answer = new int[2];
       
        for(int i = 0; i< array.length; i++) {
        	a = array[i] > a ? array[i] : a;
        }
        	answer[0] = a;
        for(int i = 0; i<array.length; i++) {
        	if(array[i]==a) {
        		answer[1]= i;
        		break;
        	}
        }
        return answer;
    }
}