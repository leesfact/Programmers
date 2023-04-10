class Solution {
    public int solution(int[] array, int n) {
       int index = 0;
        int[] abs = new int[array.length];
        
        for(int i = 0; i < array.length; i++) {
        	abs[i] = Math.abs(array[i] - n);
        }
        
        int min = abs[0];
        for(int i = 1; i < abs.length; i++) {
        	if(abs[i] < min) {
        		min = abs[i];
        		index = i;
        	}else if(abs[i] == min) {
        		if(array[i] < array[index]) {  
        	        index = i;
        	    }
        	}
  
        }
        return array[index];
    }
}