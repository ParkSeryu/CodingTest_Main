class Solution {
    public int solution(int n) {
        int answer = 2;
        double result = Math.sqrt(n);
        if(Math.floor(result) == result){
            answer = 1;
        }
        
        return answer;
    }
}