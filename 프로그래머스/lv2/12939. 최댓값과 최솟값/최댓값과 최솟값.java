class Solution {
    public String solution(String s) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        
        String[] arrays = s.split(" ");
        
        for(String array : arrays) {
        	int value = Integer.parseInt(array);
        	
        	if(minValue > value) minValue = value;
        	if(maxValue < value) maxValue = value;
        	
        }
        
        return minValue + " " + maxValue;
    }
}