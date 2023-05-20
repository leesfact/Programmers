import java.util.*;
class Solution {
    public int solution(String[] babbling) {
       String[] str = {"aya","ye","woo","ma"};
        ArrayList<String> bab = new ArrayList<>();
        int cnt = 0;
        
        for(int i = 0; i < babbling.length; i++) {
        	bab.add(babbling[i]);
        	for(int j = 0; j < str.length; j++) {
        		System.out.println("str["+j+"]: "+ str[j]);
	        	if(bab.get(i).contains(str[j])) {
	        		String replaced = bab.get(i).replace(str[j], " ");
	        		bab.set(i, replaced);
	        		if(bab.get(i).trim().isEmpty()) {
	        			cnt++;
	        		}
	        	}
        	}
        	
        }
        
       
        System.out.println(bab);
        System.out.println(cnt);
        return cnt;
    }
}