import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        Arrays.fill(answer, 0);
        
        char[] chArr = my_string.toCharArray();
        int tmp; 
        
        for(int i = 0; i < chArr.length; i++){
            if(chArr[i] >= 97){
                tmp = (int)(chArr[i] - 'A'- 6);
            }else{
                tmp = (int)(chArr[i] - 'A' );
            }
            answer[tmp] += 1;
        }

        
        return answer;
    }
}