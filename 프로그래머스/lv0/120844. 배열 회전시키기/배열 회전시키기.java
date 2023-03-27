class Solution {
    public static int[] solution(int[] numbers, String direction) {
	        int temp = 0;
	    
	        int[] newArr = new int[numbers.length]; 
	        	if(direction.equals("right")) {
	        		temp = numbers[numbers.length-1]; //temp에 마지막 값을 대입
	        		for(int i = 1; i < numbers.length; i++) {
	        			newArr[i] = numbers[i-1];
	        		}
	        		newArr[0] = temp;
	        	}else {
	        		temp = numbers[0];
	        		for(int i = 0; i<numbers.length-1; i++) {
	        			newArr[i] = numbers[i+1];
	        		}
	        		newArr[numbers.length-1] = temp;
	        		
	        	}
	        	
	        return newArr;
	    }
}