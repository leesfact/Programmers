import java.time.LocalDate;

class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);
        
        
        return dateA.isBefore(dateB) ? 1 : 0;
    }
}