class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        char[] before_arr = before.toCharArray();
        char[] after_arr = after.toCharArray();
        
        for(int i = 0 ; i < before_arr.length; i++){
            for(int j = 0; j < after_arr.length; j++){
                if(before_arr[i] == after_arr[j]){
                    after_arr[j] = '1';
                    before_arr[i] = '1';
                    break;
                }
            }
        }
        
        for(int i = 0; i < after_arr.length; i++){
            if(after_arr[i] != '1' || before_arr[i] != '1'){
                answer = 0;
            }
        }
        
        return answer;
    }
}