import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] temp = new int[3];
        int idx = 0;
        
        
        while(idx < 3){
            int min = Arrays.stream(rank).min().getAsInt();
            
            for(int i = 0; i < rank.length; i++){
                if(min == rank[i]){
                    if(attendance[i]){
                        temp[idx++] = i;
                    }
                    rank[i] = 1000;
                }
            }
        }
        
        answer = 10000 * temp[0] + 100 * temp[1] + temp[2];
        
        return answer;
    }
}