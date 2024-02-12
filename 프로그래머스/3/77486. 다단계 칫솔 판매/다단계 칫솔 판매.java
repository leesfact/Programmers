import java.util.*;
class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        Map<String, Integer> profitMap = new HashMap<>();
        Map<String, String> referralMap = new HashMap<>();
        
        
        for (int i = 0; i < enroll.length; i++) {
            profitMap.put(enroll[i], 0); 
            referralMap.put(enroll[i], referral[i]);
        }
        
        for(int i = 0; i < seller.length; i++) {
        	String currentSeller = seller[i];
        	int currentProfit = amount[i] * 100;
        	
        	while (!currentSeller.equals("-") && currentProfit > 0) {
        		int distribution = currentProfit / 10;
        		if (distribution < 1) {
    		        profitMap.put(currentSeller, profitMap.get(currentSeller) + currentProfit);
    		        break;
        		}
        		int remainingProfit = currentProfit - distribution;
        		
        		
        		profitMap.put(currentSeller, profitMap.get(currentSeller) + remainingProfit );
        		currentSeller = referralMap.get(currentSeller);
        		currentProfit = distribution;
        	}
        }
        
        int[] answer = new int[enroll.length];
        for (int i = 0; i < enroll.length; i++) {
            answer[i] = profitMap.get(enroll[i]);
        }
       
        return answer;
    }
}