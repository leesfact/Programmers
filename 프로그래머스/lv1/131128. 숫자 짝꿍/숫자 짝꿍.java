class Solution {
    public String solution(String X, String Y) {
       int[] countX = new int[10];
	        int[] countY = new int[10];
	        int[] countPair = new int[10];

	        
	        for (char c : X.toCharArray()) {
	            countX[c - '0']++;
	        }
	        for (char c : Y.toCharArray()) {
	            countY[c - '0']++;
	        }

	        
	        for (int i = 0; i <= 9; i++) {
	            countPair[i] = Math.min(countX[i], countY[i]);
	        }

	        
	        StringBuilder pair = new StringBuilder();
	        for (int i = 9; i >= 0; i--) {
	            for (int j = 0; j < countPair[i]; j++) {
	                pair.append(i);
	            }
	        }

	        
	        if (pair.length() == 0) {
	            return "-1";
	        }

	        
	        boolean isOnlyZero = true;
	        for (char c : pair.toString().toCharArray()) {
	            if (c != '0') {
	                isOnlyZero = false;
	                break;
	            }
	        }
	        if (isOnlyZero) {
	            return "0";
	        }

	        
	        int startIndex = 0;
	        while (pair.charAt(startIndex) == '0') {
	            startIndex++;
	        }
	        
	        return pair.substring(startIndex);
    }
}