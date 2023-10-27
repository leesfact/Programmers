import java.util.*;
class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        ArrayList<int[]> sortList = new ArrayList<>();
        
        Arrays.sort(data, new Comparator<int[]>() {
        	
        	@Override
        	public int compare(int[] o1, int[] o2) {
        		
        		if(o1[col - 1] == o2[col - 1]) {
        			return Integer.compare(o2[0], o1[0]);
        		}
        		
        		return Integer.compare(o1[col - 1], o2[col - 1]);
        	}
		});
        
         int answer = 0;
        
        for (int i = row_begin - 1; i <= row_end - 1; i++) {
            int s = 0;
            for (int j = 0; j < data[i].length; j++) {
                s += data[i][j] % (i + 1);
                
            }
            answer ^= s;
        }
        
        
        return answer;
    }
}