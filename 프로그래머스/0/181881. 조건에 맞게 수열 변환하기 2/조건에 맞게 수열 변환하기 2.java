import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] newArr = new int[arr.length];
        
        while(true) {
        	boolean isSame = true;
        	
        	for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    newArr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    newArr[i] = arr[i] * 2 + 1;
                } else {
                    newArr[i] = arr[i];
                }
                
                
            }
        	if (!Arrays.equals(arr, newArr)) {
        		isSame = false;
        	}
        	if (isSame) {
        		break;
        	}
        	
        	arr = newArr.clone();
        	answer++;
        }
        	
        	return answer;
    }
}