import java.util.*;
class Solution {
    
    static int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
    static boolean[][] visited;
    
    public static List<Integer> bfs (int i, int j, String[][] island){
        
        Queue<int []> queue = new LinkedList<>();
        queue.add(new int[] {i,j});
        visited[i][j] = true;
        int sum = island[i][j].equals("X") ? 0 : Integer.parseInt(island[i][j]);
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            
            for(int[] dir : dirs){
                int ni = current[0] + dir[0];
                int nj = current[1] + dir[1];
                
                if (ni >= 0 && ni < island.length && nj >= 0 && nj < island[0].length && 
   !visited[ni][nj] && !island[ni][nj].equals("X")) {
					
					queue.add(new int[] {ni, nj});
					visited[ni][nj] = true;
					sum += Integer.parseInt(island[ni][nj]);
					
				}
            }
        }
        
        if(sum == 0){
            return Collections.emptyList();
        }else{
            return Collections.singletonList(sum);
        }
    
    }
    
    
    
    public int[] solution(String[] maps) {
        String[][] island = new String[maps.length][maps[0].length()];
        visited = new boolean[maps.length][maps[0].length()];
        
        List<Integer> results = new ArrayList<>();
        
        for(int i = 0; i < maps.length; i++){
        	for(int j = 0; j < maps[i].length(); j++) {
        		island[i][j] = maps[i].split("")[j];
        	}
        }
        
        for(int i = 0; i < island.length; i++) {
        	for(int j = 0; j < island[0].length; j++) {
        		if(!visited[i][j] && !island[i][j].equals("X")) {
        			results.addAll(bfs(i, j, island));
        		}
        	}
        }
        
        Collections.sort(results);
        System.out.println(results);
        if (results.size() == 0) {
            return new int[]{-1};
        } else {
            return results.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}