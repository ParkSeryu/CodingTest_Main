class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int idx = 0;
        for(int i = myString.length(); i >= 0; i--){
            String temp = myString.substring(i - pat.length(), i);
            if(temp.equals(pat)){
                idx = i;
                break;
            }
        }
        
        for(int i = 0; i < idx; i++){
            answer += myString.charAt(i);
        }
        
        
        return answer;
    }
}