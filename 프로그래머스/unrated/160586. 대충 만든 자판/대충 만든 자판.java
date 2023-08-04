import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int n = keymap.length;
        int m = targets.length;
        int[] answer = new int[m];
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                if (!map.containsKey(keymap[i].charAt(j))) {
                    map.put(keymap[i].charAt(j), new ArrayList<>());
                }
                map.get(keymap[i].charAt(j)).add(i+1);
                map.get(keymap[i].charAt(j)).add(j+1);
            }
        }
        System.out.println(map);
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                if (!map.containsKey(targets[i].charAt(j))) {
                    sum = -1;
                    break;
                }
                else {
                    ArrayList<Integer> list = map.get(targets[i].charAt(j));
                    int min = Integer.MAX_VALUE;
                    for (int k = 0; k < list.size(); k+=2) {
                        if (list.get(k+1) < min) {
                            min = list.get(k+1);
                        }
                    }
                    sum += min;
                }
            }
            answer[i] = sum;
        }
        
        
        return answer;
    }
}