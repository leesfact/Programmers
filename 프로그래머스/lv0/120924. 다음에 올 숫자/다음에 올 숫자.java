import java.util.*;
class Solution {
    public int solution(int[] common) {
       int[] sequence = new int[common.length];
	        int radio = 0;
	        int def = 0;
	        if(!(common[0] == 0)) {
	        	 radio = common[1]/common[0];
	        }
	        	def = common[1]- common[0];
	       
	        for(int i = 1; i <= common.length-1;i++) {
	        	sequence[0] = common[0];
	        	sequence[i] = common[i-1]*radio;
	        }
	        
	        return Arrays.toString(common).equals(Arrays.toString(sequence)) ? common[common.length-1]*radio:common[common.length-1]+def;
    }
}