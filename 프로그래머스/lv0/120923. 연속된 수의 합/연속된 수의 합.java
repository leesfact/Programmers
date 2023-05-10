import java.util.Arrays;
class Solution {
    public int[] solution(int num, int total) {
       int[] array = new int[num];
        int sum = 0;
        int cnt = total;
       
        while(sum <= total) {
            if(num == 1) {
                array[0] = total; 
                return array;
        	}
        	
        	for(int i = 1; i < array.length; i++) {
        		array[0] = cnt;
        		array[i] = cnt-i;
        	}
        	
        	for(int i = 0; i < array.length; i++) {
        		sum +=array[i];
        	}
        	if(sum > total) {
        		cnt--;
        	}else if(sum < total) {
        		cnt++;
        	}else {
        		break;
        	}
        	sum = 0;
        }
        Arrays.sort(array);
        return array;
    }
}