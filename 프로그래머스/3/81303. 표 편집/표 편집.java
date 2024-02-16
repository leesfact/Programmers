import java.util.*;
class Solution {
    public String solution(int n, int k, String[] cmd) {

        int tablesize = n;
        Stack<Integer> st = new Stack<>();

        for (String command : cmd) {
            String[] commandSplit = command.split(" ");
            if (commandSplit[0].equals("U")) {
                k -= Integer.parseInt(commandSplit[1]);
                if (k < 0) k = 0;
            } else if (commandSplit[0].equals("D")) {
                k += Integer.parseInt(commandSplit[1]);
                if (k > tablesize - 1) k = tablesize - 1;
            } else if (commandSplit[0].equals("C")) {
                st.push(k);
                tablesize--;
                if(k == tablesize) k--;
            } else {
                int ret = st.pop();
                if(k>=ret) k++;
                tablesize++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tablesize; i++) {
            sb.append("O");
        }
        while(!st.empty()){
            sb.insert(st.pop().intValue(),'X');
        }
       
        return sb.toString();
    }
}