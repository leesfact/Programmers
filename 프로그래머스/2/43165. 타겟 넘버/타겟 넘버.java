class Solution {
    static int answer;
    public void dfs(int[] numbers, int target, int index, int sum) {
		
		
		if (index == numbers.length) {
    
            if (sum == target) {
                answer++;
            }
            return;
        }
		
		dfs(numbers, target, index + 1, sum + numbers[index]);
		dfs(numbers, target, index + 1, sum - numbers[index]);
		
		
		
	}
	
	public int solution(int[] numbers, int target) {
		
        answer = 0;
        
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
}