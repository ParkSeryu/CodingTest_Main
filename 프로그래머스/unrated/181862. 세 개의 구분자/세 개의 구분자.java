import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String temp = "";
        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        
        for(int i = 0; i < myStr.length(); i++){
            if(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c'){
                list.add(temp);        
                temp = "";
            }else{
                temp += myStr.charAt(i);    
            }   
        }
        list.add(temp);
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) != ""){
                list2.add(list.get(i));
            }
        }
        
        String[] answer = new String[list2.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = list2.get(i);
        }
        
        if(answer.length == 0){
            String[] t = {"EMPTY"};
            return t;
        }
        
        return answer;
    }
}