import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
       int totalUsers = stages.length;
        int[] stageUserCount = new int[N + 2];
        
        for (int stage : stages) {
            stageUserCount[stage]++;
        }

        Map<Integer, Double> stageFailRates = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            if (totalUsers != 0) {
                double failRate = (double) stageUserCount[i] / totalUsers;
                stageFailRates.put(i, failRate);
            } else {
                stageFailRates.put(i, 0.0);
            }
            totalUsers -= stageUserCount[i];
        }

        List<Map.Entry<Integer, Double>> entryList = new ArrayList<>(stageFailRates.entrySet());
        entryList.sort(Map.Entry.<Integer, Double>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()));

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = entryList.get(i).getKey();
        }
        
        return answer;
    }
}