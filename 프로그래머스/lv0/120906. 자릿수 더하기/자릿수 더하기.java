class Solution {
    public int solution(int n) {
        int answer = 0;
        String s1 = Integer.toString(n);
            String[] arr = s1.split("");
        
        for(int i = 0; i<arr.length; i++){
            answer += Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}