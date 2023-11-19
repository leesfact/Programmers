import java.util.*;
class Solution {
    public static long calculate(String expression, String opOrder) {
		List<Long> numbers = new ArrayList<>();
		List<Character> ops = new ArrayList<>();
		
		String num = "";
		
		for(char a : expression.toCharArray()) {
			if(a == '-' || a == '*' || a == '+') {
        		numbers.add(Long.parseLong(num));
        		ops.add(a);
        		num = "";
        	}else {
        		num += a;
        	}
		}
		numbers.add(Long.parseLong(num));
		
		
		for(char op : opOrder.toCharArray()) {
			for(int i = 0; i < ops.size(); i++) {
				if(ops.get(i) == op) {
					long result = 0;
					switch (op) {
                    case '+':
                        result = numbers.get(i) + numbers.get(i + 1);
                        break;
                    case '-':
                        result = numbers.get(i) - numbers.get(i + 1);
                        break;
                    case '*':
                        result = numbers.get(i) * numbers.get(i + 1);
                        break;
					}
					numbers.remove(i + 1); 
		            numbers.set(i, result); 
		            ops.remove(i); 
		            i--; 
				}
			}
		}
		
		return Math.abs(numbers.get(0));
	}
	
	public static void generateCombinations(List<Character> operators, String current, List<String> combinations ) {
		
		
		
		if(operators.isEmpty()) {
			combinations.add(current);
			return;
		}
		
		for(int i = 0; i < operators.size(); i++) {
			char operator = operators.remove(i);
			generateCombinations(operators, current + operator, combinations);
			operators.add(i, operator);
			
		}
		
	}
	
	public static long solution(String expression) {
        
        Set<Character> operatorSet = new HashSet<>();
        List<String> combinations = new ArrayList<>();
        for(char a : expression.toCharArray()) {
        	if(a == '-' || a == '*' || a == '+') {
        		operatorSet.add(a);
        	}
        }
        generateCombinations(new ArrayList<>(operatorSet), "", combinations);
        
        long max = Long.MIN_VALUE;
        for (String opOrder : combinations) {
            long result = calculate(expression, opOrder);
            max = Math.max(max, result);
        }
        
        return max;
    }
}