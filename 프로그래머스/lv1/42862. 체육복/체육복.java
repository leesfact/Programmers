import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = new ArrayList<>();
		List<Integer> reserveList = new ArrayList<>();
		
		
		for(int a : lost) {
		 lostList.add(a);
		}
        for (int r : reserve) {
            reserveList.add(r);
        }
        
        Collections.sort(lostList);
        Collections.sort(reserveList);
        
        Iterator<Integer> reserveIterator = reserveList.iterator();
        
        while(reserveIterator.hasNext()) {
        	int student = reserveIterator.next();
        	if(lostList.contains(student)) {
        		lostList.remove((Integer)student);
        		reserveIterator.remove();
        	}
        }
        reserveIterator = reserveList.iterator();
        while (reserveIterator.hasNext()) {
            int student = reserveIterator.next();
            if (lostList.contains(student - 1)) {
                lostList.remove((Integer) (student - 1));
                reserveIterator.remove();
                continue;
            }
            if (lostList.contains(student + 1)) {
                lostList.remove((Integer) (student + 1));
                reserveIterator.remove();
            }
        }
        
        
        return n - lostList.size();
    }
}