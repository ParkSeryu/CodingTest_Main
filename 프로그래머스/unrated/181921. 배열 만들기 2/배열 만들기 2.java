import java.util.*;
class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> answer = new ArrayList<Integer>();
        for(int i = l; i <= r; i++){
            String temp = String.valueOf(i);
            char[] chArr = temp.toCharArray();
            boolean flag = true;
            for(int j = 0; j < chArr.length; j++){
                if (!(chArr[j] == '5' || chArr[j] == '0')){
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                answer.add(i);
            }
        }
        
        if(answer.size() == 0){
            answer.add(-1);
        }
        
        return answer;
    }
}