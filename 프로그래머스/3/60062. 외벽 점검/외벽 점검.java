import java.util.*;
class Solution {
   static final int INF = 987654321;
	static int N;
	static int[] Weak;
	static int[] Dist;
	static int minCnt;
	
	public static void solve(int cnt, int pos, int visited) {
		
		if(cnt > Dist.length) return;
		if(cnt >= minCnt) return;
		
		
		for(int i = 0; i < Weak.length; i++) {
			int nextPos = (pos + i) %  Weak.length;
			int diff = Weak[nextPos] - Weak[pos];
			
			if(nextPos < pos) {
				diff += N;
			}
			
			if(diff > Dist[Dist.length - cnt]) {
				break;
			}
			
			visited |= 1 << nextPos;
		}
		
		if(visited == (1 << Weak.length) - 1) {
			minCnt = cnt;
			return;
		}
		
		for(int i = 0; i < Weak.length; i++) {
			if((visited & (1 << i)) != 0) {
				continue;
			}
			solve(cnt+1, i, visited);
		}
	}
	
	public static int solution(int n, int[] weak, int[] dist) {
        
        Arrays.sort(dist);
        N = n;
        Weak = weak;
        Dist = dist;
        minCnt = INF;
        
        for(int i = 0; i < Weak.length; i++) {
        	solve(1, i, 0);
        }
        
        if(minCnt == INF) {
        	return -1;
        }
        
        return minCnt;
    }
}