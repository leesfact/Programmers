import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        int leftCnt = -1;
        int rightCnt = -1;
        
        for(int i = 0; i < str_list.length; i++) {
        	if(str_list[i].equals("l")) {
        		leftCnt = i;
        		break;
        	}
        	if(str_list[i].equals("r")) {
        		rightCnt = i;
        		break;
        	
        	}
        	
        }
        
        if(leftCnt == -1 && rightCnt == -1) return new String[] {};
        
        ArrayList<String> strList = new ArrayList<>();
        if(leftCnt > rightCnt) {
        	for(int i = 0; i < leftCnt; i++) {
        		strList.add(str_list[i]);
        	}
        }else {
        	for(int i = rightCnt + 1; i < str_list.length; i++) {
        		strList.add(str_list[i]);
        	}
        }
        
 
        String[] answer = new String[strList.size()];
        for(int i = 0 ; i < answer.length; i++) {
        	answer[i] = strList.get(i);
        }
        
        return answer;
    }
}