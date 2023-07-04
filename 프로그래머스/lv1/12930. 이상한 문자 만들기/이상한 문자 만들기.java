class Solution {
    public String solution(String s) {
       StringBuilder sb = new StringBuilder();
		int count = 0;

		for (char ch : s.toCharArray()) {
			if (ch == ' ') {
				sb.append(ch);
				count = 0;  
			} else {
				if (count % 2 == 0) {
					sb.append(Character.toUpperCase(ch));
				} else {
					sb.append(Character.toLowerCase(ch));
				}
				count++;  
			}
		}

		return sb.toString();
    }
}