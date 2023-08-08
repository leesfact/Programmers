class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
		
		int[] left = {3,0}; // *의 위치
		int[] right = {3,2}; //#의 위치
		
		int[][] keyPad = {
			{0, 0}, {0, 1}, {0, 2},
            {1, 0}, {1, 1}, {1, 2},
            {2, 0}, {2, 1}, {2, 2},
            {3, 0}, {3, 1}, {3, 2}
		};
		for(int number: numbers) {
            if(number == 1 || number == 4 || number == 7) {
                answer += "L";
                left = keyPad[number - 1];
            } else if(number == 3 || number == 6 || number == 9) {
                answer += "R";
                right = keyPad[number - 1];
            } else {
                if(number == 0) number = 11;
                int leftDist = Math.abs(left[0] - keyPad[number-1][0]) + Math.abs(left[1] - keyPad[number-1][1]);
                int rightDist = Math.abs(right[0] - keyPad[number-1][0]) + Math.abs(right[1] - keyPad[number-1][1]);

                if(leftDist < rightDist) {
                    answer += "L";
                    left = keyPad[number - 1];
                } else if(leftDist > rightDist) {
                    answer += "R";
                    right = keyPad[number - 1];
                } else {
                    if(hand.equals("left")) {
                        answer += "L";
                        left = keyPad[number - 1];
                    } else {
                        answer += "R";
                        right = keyPad[number - 1];
                    }
                }
            }
        }
		
        return answer;
    }
}