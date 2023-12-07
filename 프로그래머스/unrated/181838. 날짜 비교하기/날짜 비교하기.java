import java.util.*;

class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        Date date3 = new Date(date1[0], date1[1], date1[2]);
        Date date4 = new Date(date2[0], date2[1], date2[2]);
        
        int result = date3.compareTo(date4);
        
        if(result < 0) answer = 1;
        
        return answer;
    }
}