import java.util.*;
class Solution {
    public int[] solution(String[] gems) {
        Set<String> gemTypes = new HashSet<>();
		Map<String, Integer> gemMap = new HashMap<>();
		
		for(String gem : gems) {
			gemTypes.add(gem);
		}
	
		
		int start = 0, end = 0;
		int[] answer = {0, gems.length-1};
		gemMap.put(gems[0], 1);
		
		
		
		while(start < gems.length && end < gems.length) {
			if(gemMap.size() == gemTypes.size()) {
				if(end - start < answer[1] - answer[0]) {
					answer[0] = start;
					answer[1] = end;
				}
				gemMap.put(gems[start], gemMap.get(gems[start]) - 1);
				if (gemMap.get(gems[start]) == 0) {
                    gemMap.remove(gems[start]);
                }
                start++;
            }else {
                end++;
                if (end == gems.length) break;
                gemMap.put(gems[end], gemMap.getOrDefault(gems[end], 0) + 1);
			}
		}
	
		answer[0] += 1; 
        answer[1] += 1; 
        
        
        return answer;
    }
}