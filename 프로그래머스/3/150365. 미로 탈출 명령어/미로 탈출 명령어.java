class Solution {
    public String solution(int n, int m, int x, int y, int r, int c, int k) {
        int distance = Math.abs(r - x) + Math.abs(c - y);
        if (distance > k) {
            return "impossible";
        }

        if ((k - distance) % 2 != 0) {
            return "impossible";
        }

        int down = Math.max(r - x, 0);
        int left = Math.max(y - c, 0);
        int right = Math.max(c - y, 0);
        int up = Math.max(x - r, 0);
        int pair = (k - distance) / 2;

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < k; i++) {
            if ((down > 0 || pair > 0) && x < n) {
                answer.append('d');
                if (down > 0) {
                    down--;
                } else {
                    pair--;
                    up++;
                }
                x++;
            } else if ((left > 0 || pair > 0) && y > 1) {
                answer.append('l');
                if (left > 0) {
                    left--;
                } else {
                    pair--;
                    right++;
                }
                y--;
            } else if ((right > 0 || pair > 0) && y < m) {
                answer.append('r');
                if (right > 0) {
                    right--;
                } else {
                    pair--;
                    left++;
                }
                y++;
            } else { 
                answer.append('u');
                if (up > 0) {
                    up--;
                } else {
                    pair--;
                    down++;
                }
                x--;
            }
        }
        return answer.toString();
    }
}