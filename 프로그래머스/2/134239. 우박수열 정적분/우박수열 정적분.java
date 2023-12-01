import java.util.*;
class Solution {
    public double[] solution(int k, int[][] ranges) {

        List<Integer> collatz = new ArrayList<>();
        while(k > 1) {
            collatz.add(k);
            if(k % 2 == 0) k /= 2;
            else k = k*3 +1;
        }
        collatz.add(1);

        double[] answer = new double[ranges.length];
        for(int get = 0 ; get < ranges.length ; get++) {
            double area = 0;
            int goalX = collatz.size() + ranges[get][1] - 1;

            
            if(ranges[get][0] > goalX) {
                answer[get] = -1;
                continue;
            }

            for(int x = ranges[get][0] ; x < goalX ; x++) {
                area += (collatz.get(x)+collatz.get(x+1))/2.0D;
            }
            answer[get] = area;
        }

        return answer;
    }
}