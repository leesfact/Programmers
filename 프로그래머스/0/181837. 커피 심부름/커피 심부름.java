class Solution {
    public int solution(String[] orders) {
        int count = 0;
        for(String order : orders) {
        	if(order.contains("cafelatte")) count += 5000;
        	else if(order.contains("americano")) count += 4500;
        	else count += 4500;
        }
        
        return count;
    }
}