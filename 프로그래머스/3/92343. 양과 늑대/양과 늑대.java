import java.util.*;
class Solution {
    
    static List<Integer>[] graph;
    static int answer = 0;
    
    
    public static void dfs(int index, int sheep, int wolves, int[] info, Set<Integer> unused){
        if(sheep == wolves) return;
        
        answer = Math.max(answer, sheep);
        
        for(int next : graph[index]){
            unused.add(next);
        }
        
        for(int next : unused){
            Set<Integer> set = new HashSet<>(unused);
            set.remove(next);
            if(info[next] == 1){
                dfs(next, sheep, wolves + 1, info, set);
            }else{
                dfs(next, sheep + 1, wolves, info, set);
            }
        }
    }
    public int solution(int[] info, int[][] edges) {
        int n = info.length;
        graph = new List[n];
        
        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int[] edge : edges){
            graph[edge[0]].add(edge[1]);
        }
        
        dfs(0, 1, 0, info, new HashSet<>());
        return answer;
    }
}