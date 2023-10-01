class Solution {
    public  int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String skill_tree : skill_trees){
            if(isValid(skill, skill_tree)){
                answer++;
            }
        }
        return answer;
    }
    
    
    public boolean isValid(String skill, String skill_tree){
        int idx = 0;
        
        for(char c : skill_tree.toCharArray()){
            if(skill.indexOf(c) != -1){
                if(skill.charAt(idx) == c){
                    idx++;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}