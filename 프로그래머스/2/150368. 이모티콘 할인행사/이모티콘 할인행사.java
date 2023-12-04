import java.util.*;
class Solution {
    static int[] discountIndex = {40, 30, 20, 10};
	static PriorityQueue<int[]> pq;
	static int[] discountRate;
	static int[][] users; 
    static int[] emoticons; 
	
	
	public static void generateCombinations(int N) {
		
		if(N  == discountRate.length) {
			int subscriber = 0;
			int fee = 0;
			
			for(int i = 0; i < users.length; i++) {
				int sum = 0;
				for(int j = 0; j < emoticons.length; j++) {
					if(discountRate[j] >= users[i][0]) {
						sum += emoticons[j] -((emoticons[j] * discountRate[j])/100);
					}
				}
				if(sum >= users[i][1]) subscriber++;
				else fee += sum;
			}
			pq.offer(new int[] {subscriber, fee});
			return;
		}
		
		for(int i = 0; i < discountIndex.length; i++) {
			discountRate[N] = discountIndex[i];
			generateCombinations(N + 1);
		}
		
	}
	
	
	
	public static int[] solution(int[][] usersInput, int[] emoticonsInput) {
		users = usersInput; 
        emoticons = emoticonsInput; 
        discountRate = new int[emoticons.length];
		
        pq = new PriorityQueue<>(new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] == o2[0] ? o2[1] - o1[1] : o2[0] - o1[0];
            
			}
		});
        
        generateCombinations(0);
        
        return pq.poll();
    }
}