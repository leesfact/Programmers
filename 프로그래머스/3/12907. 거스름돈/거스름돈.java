class Solution {
    public int solution(int n, int[] money) {
        int[] arr = new int[n];
        for(int i : money){
            arr[i-1] += 1;
            for(int j=0; j<n ; j++) {
                if(j>=i) { arr[j] += arr[j - i]; }
            }
        }
        return arr[n-1];
    }
}