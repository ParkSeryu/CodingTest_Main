class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        char[] chArr = code.toCharArray();
        
        for(int i = 0 ; i < chArr.length; i++){
            if(i % q == r){
                answer += chArr[i];
            }
        }
        
        return answer;
    }
}