class Solution {
    public String solution(int[] food) {
        StringBuilder front = new StringBuilder();
	        StringBuilder back = new StringBuilder();
	        
	        for(int i = 1; i < food.length; i++){
	        	int cnt = food[i] / 2;
	        	for(int j = 1; j <= cnt; j++) {
	        		front.append(i);
	        		back.insert(0, i);
	        	}
	        }
	        
	        front.append('0').append(back);
	        
	        
	        System.out.println(front.toString());
	        return front.toString();
    }
}