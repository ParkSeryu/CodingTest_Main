import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Arrays.sort(numlist);
        int[] temp = new int[numlist.length];
        
        for(int i = 0; i < temp.length; i++){
            temp[i] = Math.abs(numlist[i] - n);
        }
        
        for(int i = 0; i < answer.length; i++){
            int min = Integer.MAX_VALUE;
            int min_index = -1;
            for(int j = 0; j < temp.length; j++){   
                if(temp[j] <= min){
                    min = temp[j];
                    min_index = j;
                    //System.out.println(j + " " + temp[j] + " " + min);
                }
            }
            temp[min_index] = 10001;
            answer[i] = numlist[min_index];
        }
        
        
        return answer;
    }
}