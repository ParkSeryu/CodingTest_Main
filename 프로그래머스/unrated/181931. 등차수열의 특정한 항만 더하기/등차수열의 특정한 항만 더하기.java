class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] suArr = new int[included.length];
        
        suArr[0] = a;
        if(included[0]){
            answer += suArr[0];
        }
        for(int i = 1; i < suArr.length; i++){
            suArr[i] = suArr[i - 1] + d;
            if(included[i]){
                answer += suArr[i];
            }
        }
        
        
        
        return answer;
    }
}