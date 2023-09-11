import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 1;
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        ArrayList<String> set1 = new ArrayList<>();
        ArrayList<String> set2 = new ArrayList<>();
        
        int legnthA = str1.length();
        int legnthB = str2.length();
        
        for(int i = 0; i < legnthA - 1; i++) {
        	
        	String subString = str1.substring(i, i+2);
        	
        	if(subString.matches("[a-z]{2}")) {
        		set1.add(subString);        		
        	}
        	
        	
        }
        
        for(int i = 0; i < legnthB - 1; i++) {
        	
        	String subString = str2.substring(i, i+2);
        	
        	if(subString.matches("[a-z]{2}")) {
        		set2.add(subString);        		
        	}
        	
        }
        
       
        
        double union = set1.size() + set2.size();
        double intersection = 0;
        
        
        
        if(!set1.isEmpty() || !set2.isEmpty()) {
        	for(String s : set1) {
        		if(set2.contains(s)) {
        			intersection++;
        			set2.remove(s);
        		}
        	}
        	
        	union -= intersection;        	
        }
        
        
        
        
        if(set1.isEmpty() && set2.isEmpty()) {
        	answer *= 65536;
        }else {
        	double a = (intersection / union ) ; 
        	answer = (int) (a * 65536);        	
        }
        
        
        
        return answer;
    }
}