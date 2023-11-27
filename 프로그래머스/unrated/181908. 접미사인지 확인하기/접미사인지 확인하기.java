import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        List<String> list = new ArrayList<String>();
        
        for(int i = 0; i < my_string.length(); i++){
            String temp = "";
            for(int j = i; j < my_string.length(); j++){
               temp += my_string.charAt(j);
            }
            list.add(temp);
        }
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(is_suffix)){
                answer = 1;
            }
        }
        
        return answer;
    }
}