import java.util.*;
class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int size = arr.length > arr[0].length ? arr.length - arr[0].length : arr[0].length - arr.length; 
        if(arr.length == arr[0].length) {
        	answer = arr.clone();
        	return answer;
        }
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        if(arr.length > arr[0].length) {
        	for(int i = 0; i < arr.length; i++) {
        		ArrayList<Integer> rowList = new ArrayList<>();
        		for(int j = 0; j < arr[i].length; j++) {
        			rowList.add(arr[i][j]);
        		}
        		while(size > 0) {
        			rowList.add(0);
        			size--;
        		}
        		size = arr.length > arr[0].length ? arr.length - arr[0].length : arr[0].length - arr.length;
        		
        		
        		list.add(rowList);
        	}
        }else {
        	for(int i = 0; i < arr.length; i++) {
        		ArrayList<Integer> rowList = new ArrayList<>();
        		for(int j = 0; j < arr[i].length; j++) {
        			rowList.add(arr[i][j]);
        		}
        		
        		list.add(rowList);
        	}
        	
        	for(int i = 0; i < size; i++) {
        		ArrayList<Integer> rowList = new ArrayList<>();
        		for(int j = 0; j < arr[0].length; j++) {
        			rowList.add(0);
        		}
        		list.add(rowList);
        	}
        	
        }
        
        
        
        
        
       answer = new int[list.size()][list.get(0).size()];
       
       for(int i = 0; i < answer.length; i++) {
    	   for(int j = 0; j < answer[0].length; j++) {
    		   answer[i][j] = list.get(i).get(j);
    	   }
       }
        
       
       
       return answer;
    }
}