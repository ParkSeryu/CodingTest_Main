class Solution {
    public int[][] solution(int[][] arr) {
        int i = arr.length;
        int j = arr[0].length;
        int[][] answer = {};

        if(i > j){
            answer = new int[i][i];
            for(int a = 0; a < answer.length; a++){
                for(int b = 0; b < answer[a].length; b++){
                    if(b < j) answer[a][b] = arr[a][b];
                }
            }
            
        }else{
            answer = new int[j][j];
            for(int a = 0; a < answer.length; a++){
                for(int b = 0; b < answer[a].length; b++){
                    if(a < i) answer[a][b] = arr[a][b];
                }
            }
        }
        
        
        
        return answer;
    }
}