class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for(int i = 0, cnt = 1; i < my_string.length(); i++, cnt ++){
            if(cnt == c){
                answer += my_string.charAt(i);
            }
            if(cnt % m == 0){
                cnt = 0;
            }
        }
        
        return answer;
    }
}