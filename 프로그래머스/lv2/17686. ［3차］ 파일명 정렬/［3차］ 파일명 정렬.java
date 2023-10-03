import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    static class File {
	 		String head, number, tail;
		
	 		File(String head, String number, String tail){
	 			this.head = head;
	 			this.number = number;
	 			this.tail = tail;
		}
	}
	
	public static String[] solution(String[] files) {
        File[] fileObjs = new File[files.length];
        
        Pattern p = Pattern.compile("^([^\\d]+)(\\d+)(.*)");
        
        for(int i = 0; i < files.length; i++) {
        	
            Matcher m = p.matcher(files[i]);
            
            if (m.find()) {
                fileObjs[i] = new File(m.group(1), m.group(2), m.group(3));
            }
        }
   
        
        Arrays.sort(fileObjs, (o1, o2) -> {
            int headCompare = o1.head.compareToIgnoreCase(o2.head);
            if (headCompare != 0) return headCompare;

            int thisNumber = Integer.parseInt(o1.number);
            int otherNumber = Integer.parseInt(o2.number);
            return Integer.compare(thisNumber, otherNumber);
        });
        

        String[] answer = new String[files.length];

        for (int i = 0; i < fileObjs.length; i++) {
            answer[i] = fileObjs[i].head + fileObjs[i].number + fileObjs[i].tail;
        }
       
        return answer;
    }
}