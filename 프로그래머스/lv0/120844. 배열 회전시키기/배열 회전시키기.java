class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] rotated = new int[length];
        
        if (direction.equals("right")) { // 시계방향 회전
            for (int i = 0; i < length; i++) {
                rotated[(i+1)%length] = numbers[i];
            }
        } else { // 반시계방향 회전
            for (int i = 0; i < length; i++) {
                rotated[i] = numbers[(i+1)%length];
            }
        }
        
        return rotated;
    }
}