import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        List<Integer> listB = new ArrayList<Integer>();
        for(int i : B) {
            listB.add(i);
        }

        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < listB.size(); j++) {
                if(listB.get(j) > A[i]) {
                    listB.remove(j);
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}