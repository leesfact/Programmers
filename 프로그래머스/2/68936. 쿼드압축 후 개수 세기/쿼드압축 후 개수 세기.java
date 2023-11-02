class Solution {
    static int zeroCnt = 0;
    static int oneCnt = 0;
    
    public static void compress(int[][] arr, int x, int y, int length){
        int value = arr[x][y];
        boolean compressible = true;
        
        for(int i = x; i < x + length; i++){
            for(int j = y; j < y + length; j++){
                
                if(arr[i][j] != value){
                    compressible = false;
                    break;
                }
            }
            if(!compressible) break;
        }
        
        if(compressible) {
            if(value == 0) zeroCnt++;
            else oneCnt++;
        }else{
            int half = length / 2;
            compress(arr, x, y, half);
            compress(arr, x, y + half, half);
            compress(arr, x + half, y, half);
            compress(arr, x + half, y+ half, half);
        }
    }
    public int[] solution(int[][] arr) {
        compress(arr, 0, 0, arr.length);
        return new int[] {zeroCnt, oneCnt};
    }
}