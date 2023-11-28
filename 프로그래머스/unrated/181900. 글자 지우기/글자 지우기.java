import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        String answer = "";
        
        for(int i = 0, j = 0; i < my_string.length(); i++){
            if(j < indices.length && i == indices[j]) {
                j++;
                continue;
            }
            answer += my_string.charAt(i);
        }
        
        
        return answer;
    }
}