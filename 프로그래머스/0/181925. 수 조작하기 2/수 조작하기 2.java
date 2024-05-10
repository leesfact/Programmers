class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        int temp = numLog[0];
        for(int i = 1; i < numLog.length; i++) {
        	int nextTemp = numLog[i];
        	int x = nextTemp - temp;
        	temp = nextTemp;
        	switch(x) {
        		case 1 :
        			sb.append("w");
        			break;
        		case -1 :
        			sb.append("s");
        			break;
        		case 10 : 
        			sb.append("d");
        			break;
        		case -10 : 
        			sb.append("a");
        			break;
        		default :
        			break;
        	}
        }
        
        return sb.toString();
    }
}