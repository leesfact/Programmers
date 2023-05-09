import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        List<String> str = new ArrayList<>();

        for (int i = 0; i < quiz.length; i++) {
            String[] splitied = quiz[i].split(" ");
            str.addAll(Arrays.asList(splitied));
        }

        String[] answer = str.toArray(new String[str.size()]);
        String[] newCal = new String[answer.length/5];
        int Index = 0;
        
           for(int i = 0; i < answer.length; i += 5) {
               int x = Integer.parseInt(answer[i]);
               String operator = answer[i+1];
               int y = Integer.parseInt(answer[i+2]);
               String equal = answer[i+3];
               int result = Integer.parseInt(answer[i+4]);
               System.out.println(result);
               int cal  = 0;

               if(operator.equals("+")) {
                   cal = x + y;
               }else if(operator.equals("-")){
                   cal = x- y;
               }
               System.out.println(cal);
               newCal[Index++] = cal == result ? "O" : "X";

            }
       
        return newCal;
    }
}