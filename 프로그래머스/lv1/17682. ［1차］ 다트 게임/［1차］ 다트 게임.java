class Solution {
    public int solution(String dartResult) {
int[] score = new int[3];
		int index = -1;
		
		
		for(int i = 0; i < dartResult.length(); i++) {
			
			char c = dartResult.charAt(i);
			
			if(Character.isDigit(c)) {
				index++;
				if(c == '1' && dartResult.charAt(i+1) == '0') {
					score[index] = 10;
					i++;
				}else {
					score[index] = Character.getNumericValue(c);
				}
			}else if(c =='D') {
				score[index] = (int)Math.pow(score[index],2);
			}else if(c =='T') {
				score[index] = (int)Math.pow(score[index], 3);
			}else if(c =='*') {
			 if(index > 0) {
				 score[index - 1] *= 2;
			 }
			 score[index] *= 2;
			}else if(c =='#') {
				score[index]  *= -1;
			}
		}
	
        return score[0] + score[1] + score[2];
    }
}