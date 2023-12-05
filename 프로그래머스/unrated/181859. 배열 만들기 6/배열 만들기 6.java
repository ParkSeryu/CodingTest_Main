import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++){
            if(stk.size() == 0){
                stk.add(arr[i]);
            }
            else if(stk.size() > 0 && stk.get(stk.size() -1) == arr[i]){
                stk.remove(stk.size() - 1);
            }
            else if(stk.size() > 0 && stk.get(stk.size() - 1) != arr[i]){
                stk.add(arr[i]);
            }
        }
        int[] answer = new int[stk.size()];
        if(answer.length == 0){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
    
        for(int i = 0; i < answer.length; i++){
            answer[i] = stk.get(i);
        }
        return answer;
    }
}