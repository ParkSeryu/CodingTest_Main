class Solution {
    public int solution(int n) {
        int answer = 0;
        int t = 0;
        boolean flag = true;
        
        for(int i = 1; i <= n; i++){
            answer++;
            while(flag){
                if(String.valueOf(answer).contains("3") || answer % 3 == 0){
                    answer++;
                }else{
                    flag = false;
                }
            }
            flag = true;
        }
        return answer;
    }
}