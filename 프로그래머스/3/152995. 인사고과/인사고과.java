import java.util.*;
class Solution {
    public int solution(int[][] scores) {
        int[] myScore = scores[0];
        int myAttitudeScore = myScore[0];
        int myEvaluationScore = myScore[1];
        int mySum = myAttitudeScore + myEvaluationScore;
        int answer = 1;

        for (int[] score : scores) {
            int attitudeScore = score[0];
            int evaluationScore = score[1];
            int sum = attitudeScore + evaluationScore;

            if (attitudeScore > myAttitudeScore && evaluationScore > myEvaluationScore) {
                return -1;
            }
            if (sum > mySum) {
                if (!isNoIncentive(score, scores)) answer++;
            }
        }

        return answer;
    }

    private boolean isNoIncentive(int[] score, int[][] scores) {
        for (int[] ints : scores) {
            if (ints[0] > score[0] && ints[1] > score[1]) {
                return true;
            }
        }
        return false;
    }
}