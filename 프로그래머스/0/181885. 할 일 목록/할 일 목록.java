class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                if (str.length() > 0) str.append(",");
                str.append(todo_list[i]);
            }
        }
        
        
        
        return str.toString().split(",");
    }
}