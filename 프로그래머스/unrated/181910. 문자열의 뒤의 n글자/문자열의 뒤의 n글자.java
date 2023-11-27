class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int t = my_string.length() - n;
        for(int i = t; i < my_string.length(); i++){
            answer += my_string.charAt(i);
        }
        return answer;
    }
}