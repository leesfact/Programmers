class Solution {
    public int[] solution(int money) {
        return new int[] { money / 5500, money - ((money / 5500) * 5500) };
    }
}