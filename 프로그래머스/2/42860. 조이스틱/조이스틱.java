class Solution {
    public int solution(String name) {
        int answer = 0;
        int nameLength = name.length();
        int move = nameLength - 1;  // 최대로 이동할 수 있는 횟수 (왼쪽 혹은 오른쪽으로 모두 이동하는 경우)

        for(int i = 0; i < nameLength; i++) {
            int upDown = Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);  // 위로 이동하는 횟수와 아래로 이동하는 횟수 중 작은 값
            answer += upDown;

            int next = i + 1;
            while(next < nameLength && name.charAt(next) == 'A') {
                next++; 
            }

            move = Math.min(move, i + nameLength - next + Math.min(i, nameLength - next));  // 이
        }

        answer += move;
        
        return answer;
    }
}