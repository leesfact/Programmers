class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        int serviceChicken = 0;
        
        while(coupon >= 10 ) {
        	serviceChicken = coupon / 10;
        	coupon = serviceChicken + coupon % 10;
        	answer +=  serviceChicken;
        }
        return answer;
    }
}