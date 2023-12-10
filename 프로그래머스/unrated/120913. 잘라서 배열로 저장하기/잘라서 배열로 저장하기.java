class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int)Math.ceil((double)my_str.length() / n)];
        int idx = 0;
        String temp = "";
        for(int i = 0; i < my_str.length(); i++){
            temp += my_str.charAt(i);
            if( (i + 1) % n == 0){
                answer[idx++] = temp;
                temp = "";
            }
        }
        
        if(!temp.equals("")){
            answer[idx] = temp;
        }
        
        return answer;
    }
}