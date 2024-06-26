import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] copyRank = rank.clone();
        Arrays.sort(rank);
        int[] sortRank = rank.clone();
        Queue<Integer> queue = new LinkedList<>();
        

        
        for(int i = 0; i < rank.length; i++) {
        	for(int j = 0; j < rank.length; j++) {
        		if(sortRank[i] == copyRank[j]) queue.add(j);
        	}
        }
        
        
        ArrayList<Integer> Ranking = new ArrayList<>();
        
        
        while(!queue.isEmpty() && Ranking.size() < 3) {
        	if(attendance[queue.peek()]) Ranking.add(queue.poll());
        	else {
        		queue.poll();
        	}
        	
        }
        
        
        return (10000 * Ranking.get(0)) + (100 * Ranking.get(1)) + Ranking.get(2);
    }
}