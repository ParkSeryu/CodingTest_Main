class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length];
        
        int index = 0;
        for(int[] sc : score){
            double sum = (sc[0] + sc[1]) / 2.0;
            System.out.println(sum);
            answer[index] = 1;
            avg[index++] = sum;
        }
        
        for(int i = 0; i < answer.length; i++){
            int cnt = 0;
            for(int j = 0; j < answer.length; j++){
                if(avg[j] > avg[i]){
                    cnt++;
                }
            }
            answer[i] += cnt; 
        }
        
        return answer;
    }
}