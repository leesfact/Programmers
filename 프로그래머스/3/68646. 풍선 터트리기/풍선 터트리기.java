class Solution {
    public int solution(int[] a) {
        int answer = 0;
        int length = a.length;
        
        int[] leftMin = new int[length];
        int[] rightMin = new int[length];
        

        leftMin[0] = a[0];
        rightMin[length-1] = a[length-1];
        
        for(int i = 1; i < length; i++) {
        	leftMin[i] = Math.min(leftMin[i-1], a[i]);
        }
       
        
        
        for(int i = length - 2; i >= 0; i-- ) {
        	rightMin[i] = Math.min(rightMin[i+1], a[i]);
        }
       
        
        for(int i = 0; i < length; i++) {
        	if (i == 0 || i == length - 1 || a[i] < leftMin[i - 1] || a[i] < rightMin[i + 1]) {
                answer++;
            }
        }
        
        return answer;
    }
}