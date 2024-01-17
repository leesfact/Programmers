import java.util.*;
class Solution {
    public static int solution(String[] user_id, String[] banned_id) {
        
		Set<Set<String>> result = new HashSet<>();
		 matchUser(result, new HashSet<>(), user_id, banned_id, 0);
		
        return result.size();
    }
	
	public static void matchUser(Set<Set<String>> result, Set<String> currentSet, 
			String[] user_id, String[] banned_id, int index) {
		
		if(index == banned_id.length) {
			result.add(new HashSet<>(currentSet));
			return;
		}
		
		for(String user : user_id) {
			if(currentSet.contains(user)) continue;
			if(matches(user, banned_id[index])) {
				currentSet.add(user);
				matchUser(result, currentSet, user_id, banned_id, index + 1);
				currentSet.remove(user);
			}
		}
	}
	public static boolean matches(String user, String banned) {
		if (user.length() != banned.length()) return false;
		for (int i = 0; i < user.length(); i++) {
			if (banned.charAt(i) != '*' && user.charAt(i) != banned.charAt(i)) return false;
		}
		return true;
	}
}