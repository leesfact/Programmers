class Solution {
    public String[] solution(String my_string) {
        my_string = my_string.trim().replaceAll("\\s+", " ");
        
        return my_string.split(" ");
    }
}