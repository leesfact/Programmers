class Solution {
    
    private static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        char[] signs = new char[numbers.length];
        dfs(numbers, signs, 0, target);
        
        
        return answer;
    }

public static void dfs(int[] numbers, char[] signs, int index, int target) {
	
		
		if (index == numbers.length) {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
            	
                if (signs[i] == '+') {
                    sum += numbers[i];
                } else {
                    sum -= numbers[i];
                }
            }

            if (sum == target) {
                answer++;  
            }
            
            return;
        }

        
        signs[index] = '+';
        dfs(numbers, signs, index + 1,target);

        signs[index] = '-';
        dfs(numbers, signs, index + 1,target);
       
	}
}