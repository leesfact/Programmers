
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] map = new String[n];

        for (int i = 0; i < n; i++) {
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]); 
            String formattedBinary = String.format("%" + n + "s", binary).replace(' ', '0'); 
            map[i] = formattedBinary.replace('1', '#').replace('0', ' '); 
        }

       

        return map;
    }
}