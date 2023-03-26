class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int a = 0;
        int max = -999999999;

        if( numbers.length == 1) {
        	max = numbers[0];
        }else {
            for(int i = 0; i< numbers.length-1; i++) {
            	
            	for(int j =i+1; j< numbers.length; j++) {
            		a = numbers[i]*numbers[j];
            		if(a>max) {
            			max = a;
            		}
            	}
            
            }
        }
        answer = max;
        return answer;
    }
}