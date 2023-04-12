class Solution {
    public int solution(String my_string) {
       int answer = 0;
		
		my_string = my_string.replaceAll("[^\\d]+", " ");
		String[] str = my_string.split(" ");

		for (int i = 0; i < str.length; i++) {
	        if (!str[i].isEmpty()) { 
	            int num = Integer.parseInt(str[i]);
	            answer += num;
	        }
	    }
	    return answer;
    }
}