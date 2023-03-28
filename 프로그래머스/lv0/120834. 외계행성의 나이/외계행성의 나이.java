class Solution {
    public String solution(int age) {
        String answer = "";
        String numStr = Integer.toString(age);
        String[] str = new String[numStr.length()];

        // 각 자리수를 문자열로 변환하여 배열에 넣기
        for (int i = 0; i < str.length; i++) {
            str[i] = Character.toString(numStr.charAt(i));
            if(str[i].equals("0")) {
            	str[i] = "a";
            }else if(str[i].equals("1")) {
            	str[i] = "b";
            }else if(str[i].equals("2")) {
            	str[i] = "c";
            }else if(str[i].equals("3")) {
            	str[i] = "d";
            }else if(str[i].equals("4")) {
            	str[i] = "e";
            }else if(str[i].equals("5")) {
            	str[i] = "f";
            }else if(str[i].equals("6")) {
            	str[i] = "g";
            }else if(str[i].equals("7")) {
            	str[i] = "h";
            }else if(str[i].equals("8")) {
            	str[i] = "i";
            }else {
            	str[i] = "j";
            }
            answer+= str[i];
        }
        return answer;
    }
}