class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
		int maxHeight = 0;
		
		for(int[] size : sizes) {
			int w = Math.max(size[0], size[1]);
			int h = Math.min(size[0], size[1]);
			
			System.out.println("w: " + w);
			System.out.println("h: " + h);
			
			maxWidth = Math.max(maxWidth, w);
			maxHeight = Math.max(maxHeight, h);
					
			
		}
		
		return maxWidth * maxHeight;
    }
}