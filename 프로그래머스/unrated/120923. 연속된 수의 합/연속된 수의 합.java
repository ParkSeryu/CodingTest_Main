class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int idx = total + 100;
        
        while(true){
            int sum = 0;
            int gizun = idx - answer.length;
            for(int i = 0; i < answer.length; i++){
                answer[i] = gizun++;
            }
            
            for(int i = 0; i < answer.length; i++){
                sum += answer[i];
            }
            
            if(sum == total){
                return answer;
            }
            idx -= 1;
        }
    }
}