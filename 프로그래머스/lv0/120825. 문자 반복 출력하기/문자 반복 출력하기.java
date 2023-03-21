class Solution {
    public String solution(String my_string, int n) {
       String answer = "";
        String[] arr = my_string.split(""); // 매개변수를 받아와 배열에 넣는 작업
      
        
        for(int i = 0; i<arr.length; i++) {
        	for(int j = 0; j<n; j++) {
        	 answer += arr[i]; 
        	}
        }
        System.out.println(answer);
        return answer;
    }
}