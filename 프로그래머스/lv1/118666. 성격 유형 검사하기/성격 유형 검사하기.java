class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] scores = new int[8];
        int[] points = {3,2,1,0,1,2,3};
        
        for(int i = 0; i < survey.length; i++) {
        	char[] pair = survey[i].toCharArray();
        	int index = -1;
        	
        	switch (pair[choices[i] <= 4 ? 0 : 1]) {
	        	case 'R': index = 0; break;
	            case 'T': index = 1; break;
	            case 'C': index = 2; break;
	            case 'F': index = 3; break;
	            case 'J': index = 4; break;
	            case 'M': index = 5; break;
	            case 'A': index = 6; break;
	            case 'N': index = 7; break;
        	}
        	
        	scores[index] += points[choices[i] - 1];
        	
        }
        StringBuilder result = new StringBuilder();
        result.append(scores[0] > scores[1] ? 'R' : scores[0] < scores[1] ? 'T' : 'R');
        result.append(scores[2] > scores[3] ? 'C' : scores[2] < scores[3] ? 'F' : 'C');
        result.append(scores[4] > scores[5] ? 'J' : scores[4] < scores[5] ? 'M' : 'J');
        result.append(scores[6] > scores[7] ? 'A' : scores[6] < scores[7] ? 'N' : 'A');
        
        return result.toString();
    }
}