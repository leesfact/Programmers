class Solution {
    public String solution(String letter) {
       String[] Morse = {".-","-...","-.-.","-..",".","..-.","--.","....",
	            "..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
	            "...","-","..-","...-",".--","-..-","-.--","--.."};
	      
	      String[] convert = letter.split(" ");
	  
	        String answer = "";
	     
	        for(int i = 0; i < convert.length; i++) {
	           for(int j = 0; j < Morse.length; j++) {
	              if(convert[i].equals(Morse[j])) {
	            	  
	            	char letterChar = (char)(j + 97);
	            	answer += Character.toString(letterChar);
	                
	              }
	           }
	        }
	        return answer;
    }
}