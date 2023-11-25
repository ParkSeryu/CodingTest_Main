import java.util.Arrays;

class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        char[] charArr = code.toCharArray();
        
        for(int i = 0; i < charArr.length; i++){
            if (charArr[i] == '1'){
                if(mode == 0){
                    mode = 1;
                }else{
                    mode = 0;
                }
            }
            else{
                if(mode == 0){
                    if( i % 2 == 0){
                        answer += charArr[i];
                    }
                }
                else{
                    if( i % 2 != 0 ){
                        answer += charArr[i];
                    }
                }
            }
        }
        if (answer.equals("")){
            answer = "EMPTY";
        }
        return answer;
    }
}