import java.util.*;
class Solution {
   public static boolean checkBinaryTree(String now) {
		
		int mid = now.length() / 2;
		char parents = now.charAt(mid);
		String leftChild = now.substring(0,mid);
		String rightChild = now.substring(mid+1, now.length());
	
		
		
		if(parents == '0' && (leftChild.charAt(mid/2) == '1' || rightChild.charAt(mid/2) == '1')) return false;
		
		if(leftChild.length() >= 3) {
			if(!checkBinaryTree(leftChild)) return false;
		}
		
		if(rightChild.length() >= 3) {
			if(!checkBinaryTree(rightChild)) return false;
		}
		
		return true;
	}
	
	public static int[] solution(long[] numbers) {
        int[] answer = new int[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
        	String now = Long.toBinaryString(numbers[i]);
        	
        	
        	int treeHeight = 0;
        	
        	while(Math.pow(2, treeHeight) - 1 < now.length() ) { 
        		treeHeight++;
        	}
        	int treeSize = (int) (Math.pow(2, treeHeight) - 1); 
        	
        	
        	while(treeSize > now.length()){
        		now = "0" + now;
        	}
        	answer[i] = checkBinaryTree(now) ? 1 : 0;
        	
        }
       
        return answer;
    }
}