import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


class Solution {
    public static String solution(String s) {
      String answer = "";
		   Set<String> dupliSet = new LinkedHashSet<>();
		   Set<String> nonDupliSet = new LinkedHashSet<>();
		   for(int i = 0; i < s.length(); i++) {
			  String c =  Character.toString(s.charAt(i));
			  
			 if(nonDupliSet.contains(c)) {
				 dupliSet.add(c);
			 }else {
				 nonDupliSet.add(c);
			 }
		   }
		   
		   Iterator<String> iterator = nonDupliSet.iterator();
		   while(iterator.hasNext()) {
			   String c = iterator.next();
			   if(dupliSet.contains(c)) {
				   iterator.remove();
			   }
		   }
	        
		   String[] newStr = new String[nonDupliSet.size()];
		   newStr = nonDupliSet.toArray(newStr);
		   Arrays.sort(newStr);
		   
	       for(String str : newStr) {
	    	   answer += str;
	       }

		  
		   return answer;
    }
}