class Solution {
    public int solution(String number) {
        int answer = 0;
        
        char[] chArr = number.toCharArray();
        
        for(int i = 0 ; i < chArr.length; i++){
            
            answer += chArr[i] - '0';
        }
        
         answer = answer % 9;
        
        return answer;
    }
}