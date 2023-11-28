import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        
        for(int i = 0; i < query.length; i++){
            int size = list.size(); 
            if(i % 2 == 0){
                for(int j = query[i] + 1; j < size; j++)
                {
                    list.remove(query[i] + 1);
                }
            }
            else{
                for(int j = 0; j < query[i]; j++){
                    list.remove(0);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}