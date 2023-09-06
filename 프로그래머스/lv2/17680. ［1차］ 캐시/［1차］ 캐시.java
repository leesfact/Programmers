import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        LinkedList<String> cityList = new LinkedList<>();
        
        int runTime = 0;
        
        for(String city : cities) {
        	
        	city = city.toLowerCase();
        	
        	if(cityList.contains(city)) {
        		cityList.remove(city);
        		runTime += 1;
        	}else {
        		if(cityList.size() == cacheSize && cacheSize != 0) {
        			cityList.removeFirst();
        		}
        		runTime += 5;
        	}
        	
        	if(cacheSize != 0) {
        		cityList.addLast(city);
        	}
        	
        }
        
        return runTime;
    }
}