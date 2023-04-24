class Solution {
    public int solution(String[] spell, String[] dic) {
       int answer = 0;
        String[] word = new String[dic.length];
        int spellLength = 0;
        
        for (String s :spell) {
        	spellLength += s.length();
        }
        
   
        
        for(int i = 0; i < dic.length; i++) {
           word[i] = dic[i];
           for(String s : spell) {
              word[i] = word[i].replaceFirst(s, "");
           }
           
           if(spellLength == dic[i].length() && word[i].length() == 0) {
        	   answer = 1;
        	   break;
           }else {
        	   answer = 2;
           }
             
        }

        System.out.println(answer);
        return answer;
    }
}