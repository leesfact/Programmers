class Solution {
    public int[] solution(int[] arr) {
        if(arr.length <= 1) {
		 		return new int[] {-1};
		 	}
		 
		 
	        int smalltestNumber = arr[0];
	        
	        for(int i = 1; i < arr.length; i++) {
	        	smalltestNumber = Math.min(smalltestNumber, arr[i]);
	        }
	        
	        int[] newArr = new int[arr.length-1];
	        int index = 0; 
	        for(int i = 0; i < arr.length ; i++) {
	        	if(arr[i] != smalltestNumber) {
	        		newArr[index++] = arr[i];
	        	}
	        }
	        
	        return newArr;
    }
}