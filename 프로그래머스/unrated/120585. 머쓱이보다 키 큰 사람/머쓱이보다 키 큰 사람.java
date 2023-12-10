import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        Integer[] conv = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(conv, Collections.reverseOrder());
    
        
        for(Integer each : conv){
            if(each > height){
                answer++;
            }else{
                return answer;
            }
        }
        
        return answer;
    }
}