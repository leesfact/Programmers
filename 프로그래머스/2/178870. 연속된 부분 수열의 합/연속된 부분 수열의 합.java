class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int left = 0, right = 0;
        int sum =sequence[0];
        int minLength = Integer.MAX_VALUE;
        
        while (right < sequence.length) {
            if (sum == k) {
                
                if (right - left < minLength) {
                    answer[0] = left;
                    answer[1] = right;
                    minLength = right - left;  
                }
                sum -= sequence[left];  
                left++;
            } else if (sum < k) {
                right++;
                if (right < sequence.length) {
                    sum += sequence[right];
                }
            } else {
                sum -= sequence[left];
                left++;
                if (left > right && left < sequence.length) {
                    right = left;
                    sum = sequence[left];
                }
            }
        }
        
        return answer;
    }
}