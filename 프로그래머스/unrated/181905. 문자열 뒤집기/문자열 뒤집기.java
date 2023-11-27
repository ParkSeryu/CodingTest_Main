class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String temp = my_string.substring(s, e + 1);
        StringBuffer sb = new StringBuffer(temp);
        String reverse = sb.reverse().toString();
        
        char[] chArr = my_string.toCharArray();
        
        int idx = 0;
        for(int i = s; i <= e; i++){
            chArr[i] = reverse.charAt(idx++);
        }
        
        for(int i = 0; i < chArr.length; i++){
            answer += chArr[i];
        }
        
        
        return answer;
    }
}