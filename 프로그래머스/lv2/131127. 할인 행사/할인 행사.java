import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> wantMap = new HashMap<>();
        
        for(int i = 0; i < want.length; i++) {
        	wantMap.put(want[i], number[i]);
        }
        
        int totalDiscountDay = 0;
        
        for(int a : number) {
        	totalDiscountDay += a;
        }
        
        
        for(int i = 0; i <= discount.length - totalDiscountDay; i++) {
            HashMap<String, Integer> tempMap = new HashMap<>(wantMap);
            for(int j = i; j < i + totalDiscountDay; j++) {
                if(tempMap.containsKey(discount[j])) {
                    tempMap.put(discount[j], tempMap.get(discount[j]) - 1);
                    if(tempMap.get(discount[j]) == 0) {
                        tempMap.remove(discount[j]);
                    }
                }
            }
            
            if(tempMap.isEmpty()) {
                answer++;
            }
        }
       
        return answer;
    }
}