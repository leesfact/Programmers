class Solution {
   static int[][] DIRS = {{1,0}, {0,-1}, {0,1}, {-1,0}};
    static char[] dirChars = {'d', 'l', 'r', 'u'};
    static String bestPath = null;

    public static boolean dfs(int x, int y, int r, int c, int k, StringBuilder path, int n, int m) {
        int remainingDistance = Math.abs(r - x) + Math.abs(c - y);

        if (k < remainingDistance || (k - remainingDistance) % 2 != 0) return false;

        if (x == r && y == c && k == 0) {
            bestPath = path.toString();
            return true; // 유효한 경로를 찾았으므로 true 반환
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + DIRS[i][0];
            int ny = y + DIRS[i][1];
            if (nx > 0 && nx <= n && ny > 0 && ny <= m) {
                path.append(dirChars[i]);
                if (dfs(nx, ny, r, c, k - 1, path, n, m)) {
                    return true; // 하위 호출에서 유효한 경로를 찾았으므로 추가 탐색 중단
                }
                path.deleteCharAt(path.length() - 1);
            }
        }
        return false; // 이 지점에 도달했다면 유효한 경로를 찾지 못한 것이므로 false 반환
    }

    public static String solution(int n, int m, int x, int y, int r, int c, int k) {
        StringBuilder path = new StringBuilder();
        if (!dfs(x, y, r, c, k, path, n, m)) {
            return "impossible";
        }
        return bestPath;
    }
}