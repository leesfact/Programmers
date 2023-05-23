import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<Integer, String> rank = new HashMap<>();
        Map<String, Integer> player = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            rank.put(i + 1, players[i]); 
            player.put(players[i], i + 1); 
        }

        for (String currentPlayer : callings) {
            int currentRank = player.get(currentPlayer); 
            int frontRank = currentRank - 1;         
            String frontPlayer = rank.get(frontRank); 

            rank.put(frontRank, currentPlayer); 
            rank.put(currentRank, frontPlayer); 
            player.put(frontPlayer, currentRank); 
            player.put(currentPlayer, frontRank); 
        }

        String[] answer = new String[players.length];
        int cnt = 0;
        for(String str : rank.values()){
            answer[cnt++] = str;
        }

        return answer;
    }
}