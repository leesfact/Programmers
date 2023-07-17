class Solution {
    public String solution(int a, int b) {
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		int[] monthDays = {31,29,31,30,31,30,31,31,30,31,30,31}; 
        
		int totalDays = b;
		
		for(int i = 0; i < a - 1; i++) {
			totalDays += monthDays[i];
		}
       
        return week[(totalDays - 1) % 7];
    }
}