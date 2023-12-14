import java.util.*;
class Solution {
   static Map<String, List<Integer>> infoMap = new HashMap<>();
	
	
	public static void preprocessInfo(String[] info) {
		for (String i : info) {
            String[] parts = i.split(" ");
            int score = Integer.parseInt(parts[4]);

            
            for (int a = 0; a < 2; a++) {
                String lang = (a == 1) ? parts[0] : "-";
                for (int b = 0; b < 2; b++) {
                    String field = (b == 1) ? parts[1] : "-";
                    for (int c = 0; c < 2; c++) {
                        String career = (c == 1) ? parts[2] : "-";
                        for (int d = 0; d < 2; d++) {
                            String food = (d == 1) ? parts[3] : "-";
                            String key = lang + " " + field + " " + career + " " + food;

                           
                            infoMap.computeIfAbsent(key, k -> new ArrayList<>()).add(score);
                        }
                    }
                }
            }
        }
		

        // 각 조건에 대한 점수 리스트 정렬
        for (String key : infoMap.keySet()) {
            Collections.sort(infoMap.get(key));
        }
	}
	
	
	public static int getAnswer(String query) {
        String[] parts = query.replace(" and ", " ").split(" ");
        String key = parts[0] + " " + parts[1] + " " + parts[2] + " " + parts[3];
        int score = Integer.parseInt(parts[4]);

        if (!infoMap.containsKey(key)) return 0;

        List<Integer> scores = infoMap.get(key);
       
        int left = 0, right = scores.size();
        while (left < right) {
            int mid = (left + right) / 2;
            if (scores.get(mid) >= score) right = mid;
            else left = mid + 1;
        }

        return scores.size() - left;
    }
	
	public static int[] solution(String[] info, String[] query) {
		
		preprocessInfo(info);
		
		int[] answer = new int[query.length];
		
		for(int i = 0; i < query.length; i++) {
			answer[i] = getAnswer(query[i]);		
	}
		
        return answer;
    }
}