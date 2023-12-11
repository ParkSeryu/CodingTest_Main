class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x = dots[0][0];
        int y = dots[0][1];
        boolean flag_x = true;
        boolean flag_y = true;
        
        for(int[] dot : dots){
            if(dot[0] != x && flag_x){
                x = Math.abs(dot[0] - x);
                flag_x = false;
            }
            
            if(dot[1] != y && flag_y){
                y = Math.abs(dot[1] - y);
                flag_y = false;
            }
        }
        
        answer = x * y;
        
        return answer;
    }
}