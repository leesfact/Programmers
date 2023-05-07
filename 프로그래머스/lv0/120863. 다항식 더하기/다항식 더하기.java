class Solution {
    public String solution(String polynomial) {
       
		int xCoefi = 0;
		int constant = 0;
		
		for(String s : polynomial.split(" ")) {
			if(s.contains("x")) {
				xCoefi +=s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
			}else if(!s.equals("+")) {
				constant += Integer.parseInt(s);
			}
		}
		
		StringBuilder result = new StringBuilder();
        
		if(xCoefi != 0) {
			if (xCoefi > 1) {
				result.append(xCoefi);
			}
			result.append("x");
		}
		
		if(constant !=0) {
			if( xCoefi != 0) {
				result.append(" + ");
				
			}
			result.append(constant);
		}else if(xCoefi == 0) {
			result.append("0");
		}
		
		return result.toString();
    }
}