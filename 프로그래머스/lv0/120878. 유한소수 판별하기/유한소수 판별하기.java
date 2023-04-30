class Solution {
    public int solution(int a, int b) {
            int answer = 0;
    if (a == 1) return 1;
    
    // 소인수분해
    for (int i = 2; i <= a; i++) {
        if (a % i == 0 && b % i == 0) {
            a /= i;
            b /= i;
            i--;
        }
    }
    
    // 2와 5 이외의 소수가 있는지 확인
    while (b % 2 == 0) b /= 2;
    while (b % 5 == 0) b /= 5;
    
    if (b == 1) answer = 1;
    else answer = 2;
    
    return answer;
    }
}