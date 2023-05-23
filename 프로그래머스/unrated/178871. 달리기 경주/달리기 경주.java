import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
       Map<String, Integer> playerIndexMap = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            playerIndexMap.put(players[i], i);
        }

        for (String calling : callings) {
            int callingIndex = playerIndexMap.get(calling);
            if (callingIndex > 0) {
                String temp = players[callingIndex - 1];
                players[callingIndex - 1] = players[callingIndex];
                players[callingIndex] = temp;
                playerIndexMap.put(players[callingIndex], callingIndex);
                playerIndexMap.put(players[callingIndex - 1], callingIndex - 1);
            }
        }

        return players;
    }
}