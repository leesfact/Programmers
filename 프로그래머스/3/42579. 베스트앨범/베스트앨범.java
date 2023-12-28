import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
         Map<String, Integer> genrePlayCount = new HashMap<>();
        Map<String, List<int[]>> genreSongs = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            genrePlayCount.put(genres[i], genrePlayCount.getOrDefault(genres[i], 0) + plays[i]);
            genreSongs.computeIfAbsent(genres[i], k -> new ArrayList<>()).add(new int[] {i, plays[i]});
        }
        
        List<String> sortedGenres = new ArrayList<>(genrePlayCount.keySet());
        sortedGenres.sort((a, b) -> genrePlayCount.get(b).compareTo(genrePlayCount.get(a)));
        
        List<Integer> bestAlbum = new ArrayList<>();
        for (String genre : sortedGenres) {
            List<int[]> songs = genreSongs.get(genre);
            songs.sort((a, b) -> b[1] != a[1] ? b[1] - a[1] : a[0] - b[0]); 

            for (int i = 0; i < Math.min(songs.size(), 2); i++) {
                bestAlbum.add(songs.get(i)[0]);
            }
        }
        
        
        return bestAlbum.stream().mapToInt(i -> i).toArray();
    }
}