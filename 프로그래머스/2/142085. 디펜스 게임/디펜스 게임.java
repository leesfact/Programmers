import java.util.*;
class Solution {
    public int solution(int n, int k, int[] enemy) {
         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int soldiers = n;
        int immuneUses = k;
        int rounds = 0;
        
        for (int currentEnemy : enemy) {
            pq.add(currentEnemy); 
            
            if (soldiers < currentEnemy) {  
                if (immuneUses == 0) break; 
                soldiers += pq.poll(); 
                immuneUses--; 
            }
            
            soldiers -= currentEnemy; 
            rounds++; 
        }
        
        return rounds;
    }
}