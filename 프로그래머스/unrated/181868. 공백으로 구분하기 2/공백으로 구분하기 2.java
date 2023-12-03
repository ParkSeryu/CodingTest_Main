import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        List<String> list = new ArrayList<String>();
        
        for(int i = 0; i < answer.length; i++){
            if(answer[i].equals("")){
                continue;
            }
            
            list.add(answer[i]);
        }
        
        answer = new String[list.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}