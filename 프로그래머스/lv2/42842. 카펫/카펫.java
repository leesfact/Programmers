import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
       int total = brown + yellow;
		   
		   for(int width = total; width >= 3; width--) {
			   
			   if(total % width == 0) {
				   int length = total / width;
				 
				   
				   int currentBrown = (width * 2) + (length - 2) * 2;
				   
				   
				   
				   if(currentBrown == brown) {
					   return new int[] {width, length};
				   }
			   }
		   }
		 
		 
	       return null;
    }
}