import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        String[][] map = new String[park.length][park[0].length()];
        int x = 0, y = 0;

        for (int i = 0; i < park.length; i++) {
            map[i] = park[i].split("");

            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j].equals("S")) {
                    x = j;
                    y = i;
                }
            }
        }
        System.out.println("start지점 y: " + y + ", x: " + x);

        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; // E, W, S, N in Cartesian coordinates
        String dirStr = "EWSN";

        for (String route : routes) {
            String[] parts = route.split(" ");

            char dirChar = parts[0].charAt(0);
            int steps = Integer.parseInt(parts[1]);

            System.out.println("방향: " + dirChar + ", 벡터: " + steps);

            int dirIndex = dirStr.indexOf(dirChar);

            int tempY = y;
            int tempX = x;
            for (int i = 0; i < steps; i++) {
                int newY = y + dirs[dirIndex][0];
                int newX = x + dirs[dirIndex][1];
                System.out.println("newY: " + newY + ", newX:" + newX);

                if (newX < 0 || newY < 0 || newX >= map[0].length || newY >= map.length || map[newY][newX].equals("X")) {
                    System.out.println("Failed to move " + dirChar + " at step " + (i + 1));
                    y = tempY;
                    x = tempX;
                    break;
                } else {
                    y = newY;
                    x = newX;
                }
            }

            System.out.println("현재 위치: (" + y + ", " + x + ")");
        }

        int[] coordinate = new int[]{y, x};
        System.out.println(Arrays.toString(coordinate));
        return coordinate;
    }
}