import java.util.*;
class Solution {
    static List<Double> areas;
	static List<Double> rangeWidth;
	
	public static void calculateArea(List<int[]> list) {
		for(int i = 0; i < list.size() - 1; i++) {
			double square = Math.min(list.get(i)[1], list.get(i+1)[1]);
			double triangle = Math.abs(((double)list.get(i+1)[1] - (double)list.get(i)[1]) / 2);
			areas.add(square+triangle);
			
		}
		
	}
	public static void getRange(List<Double> range,int x1, int x2) {
		
		double totalArea = 0;
		
		if(x2 < x1) totalArea = -1.0;
		else {
			for(int i = x1; i < x2; i++) {
				totalArea += range.get(i);
			}			
		}
	
		rangeWidth.add(totalArea);
	}
	public static double[] solution(int k, int[][] ranges) {
        
		areas = new ArrayList<>();
		rangeWidth = new ArrayList<>();
        int hailNumber = k;
        int n = 0;
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[] {n, hailNumber});
        while(hailNumber != 1) {
        	n++;
        	if(hailNumber % 2 == 0) {
        		hailNumber /= 2;
        	}else {
        		hailNumber = (hailNumber * 3) + 1;
        	}
        	list.add(new int[] {n,hailNumber});
        	
        	
        }
        calculateArea(list);
        
        
        for(int[] range : ranges) {
        	int a = range[0];
        	int b = n + range[1];
        	getRange(areas,a,b);
        }
        double[] answer = new double[ranges.length];
        for(int i = 0; i < rangeWidth.size(); i++) {
        	answer[i] = rangeWidth.get(i);
        }
        
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}