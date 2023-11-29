import java.util.*;
class Solution {
    static int rowCnt, colCnt;
	static List<Set<Integer>> candidateKeys = new ArrayList<>();
	
	public static int solution(String[][] relation) {
        
        rowCnt= relation.length; 
        colCnt = relation[0].length;
        
        for(int i = 1; i <= colCnt; i++) {
        	combine(relation, new HashSet<>(), 0, i);
        }
        
        return candidateKeys.size();
    }
	
	public static void combine(String[][] relation, Set<Integer> selectedColumns, int start, int number) {
		
		if(selectedColumns.size() == number) {
			if(checkUniqueness(relation, selectedColumns) && checkMinimality(selectedColumns)) {
				candidateKeys.add(new HashSet<>(selectedColumns));
			}
			return;
		}
		
		for(int i = start; i < colCnt; i++) {
			if(!selectedColumns.contains(i)) {
				selectedColumns.add(i);
				combine(relation, selectedColumns, i + 1, number);
				selectedColumns.remove(i);
			}
		}
	}
	
	public static boolean checkUniqueness(String[][] relation, Set<Integer> selectedColumns) {
		Set<String> uniqueCombinations = new HashSet<>();
        for (String[] tuple : relation) {
            StringBuilder keyBuilder = new StringBuilder();
            for (int column : selectedColumns) {
                keyBuilder.append(tuple[column]).append(":");
            }
            uniqueCombinations.add(keyBuilder.toString());
        }
        return uniqueCombinations.size() == rowCnt;
	}
	
	public static boolean checkMinimality(Set<Integer> selectedColumns) {
        for (Set<Integer> candidateKey : candidateKeys) {
            if (selectedColumns.containsAll(candidateKey)) {
                return false;
            }
        }
        return true;
    }
}