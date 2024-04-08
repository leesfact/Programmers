class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) {
        	return arr1.length > arr2.length ? 1 : -1;
        }else {
        	int size = arr1.length;
        	int arr1sum = 0;
        	int arr2sum = 0;
        	for(int i = 0; i < size; i++) {
        		arr1sum += arr1[i];
        		arr2sum += arr2[i];
        	}
        	
        	if(arr1sum > arr2sum) return 1;
        	else if(arr1sum < arr2sum) return -1;
        	else return 0;
        }
    }
}