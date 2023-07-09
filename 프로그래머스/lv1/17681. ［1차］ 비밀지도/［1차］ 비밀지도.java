import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] arr1Decoding = new String[n];
        String[] arr2Decoding = new String[n];

        for(int i = 0; i < arr1.length; i++) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            // arr1 이진 변환
            int value = arr1[i];
            while(value > 0) {
                sb1.append(value % 2);
                value /= 2;
            }
            arr1Decoding[i] = sb1.reverse().toString();

            while(arr1Decoding[i].length() < n) {
                arr1Decoding[i] = "0" + arr1Decoding[i];
            }

            
            value = arr2[i];
            while(value > 0) {
                sb2.append(value % 2);
                value /= 2;
            }
            arr2Decoding[i] = sb2.reverse().toString();

            
            while(arr2Decoding[i].length() < n) {
                arr2Decoding[i] = "0" + arr2Decoding[i];
            }
        }

        
        String[] map = new String[n];
        for (int i = 0; i < n; i++) {
            int num1 = Integer.parseInt(arr1Decoding[i], 2);
            int num2 = Integer.parseInt(arr2Decoding[i], 2);
            int orResult = num1 | num2;
            

            map[i] = String.format("%" + n + "s", Integer.toBinaryString(orResult)).replace(' ', '0');
        }

        for(int i = 0; i < n; i++) {
            map[i] = map[i].replace('1', '#').replace('0', ' ');
        }
        System.out.println(Arrays.toString(map));

        return map;
    }
}