import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> temp = new ArrayList<Integer>();
        
        for(int i = 0; i < intStrs.length; i++){
            char[] chArr = intStrs[i].toCharArray();
            String tempString = "";
            for(int j = 0; j < l; j++){
                tempString += chArr[s + j];
            }
            int tempInt = Integer.parseInt(tempString);
            System.out.println(tempInt);
            if(tempInt > k){
                temp.add(tempInt);
            }
        }
        
        int[] answer = new int[temp.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = temp.get(i);
        }

        return answer;
    }
}