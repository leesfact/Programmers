import java.util.*;
class Solution {
    public static int solution(int[] stones, int k) {
		 int left = 0;
		 int right = Arrays.stream(stones).max().getAsInt();
		 
		 while(left <= right) {
			 int mid = (left + right) / 2;
	
			 if(canCross(stones, k, mid)) {
				 left = mid + 1;
			 }else {
				  right = mid - 1;
			 }
			 
		 }
		 
		 return right;
	 }
	 
	 public static boolean canCross(int[] stones, int k, int mid) {
		 int count = 0;
		 for(int stone : stones) {
			 if(stone - mid < 0) {
				 count++;
			 }else {
				 count = 0;
			 }
			 if(count == k) return false;
		 }
		 
		 return true;
	 }
}