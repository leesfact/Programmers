import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int a : score) {
            list.add(a);
        }

        Collections.sort(list, Comparator.reverseOrder());

        int[] box = new int[m];
        int boxIndex = 0;

        for(int i = 0; i < list.size(); i++) {
            box[boxIndex++] = list.get(i);

            if(boxIndex == m) { 
                int min = box[0];
                for(int j = 1; j < m; j++) {
                    if(box[j] < min) {
                        min = box[j];
                    }
                }

                answer += min * m;
                boxIndex = 0; 
            }
        }

        return answer;
    }

}