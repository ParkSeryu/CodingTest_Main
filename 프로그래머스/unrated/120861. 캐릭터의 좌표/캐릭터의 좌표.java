class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        
        for(String key: keyinput){
            if(key.equals("up")){
                int nx = answer[0] + dx[0];
                int ny = answer[1] + dy[0];
                if(isMovePossible(nx, ny, board)){
                    answer[0] = nx;
                    answer[1] = ny;
                }
            }else if(key.equals("down")){
                int nx = answer[0] + dx[1];
                int ny = answer[1] + dy[1];
                if(isMovePossible(nx, ny, board)){
                    answer[0] = nx;
                    answer[1] = ny;
                }
                
            }else if(key.equals("left")){
                int nx = answer[0] + dx[2];
                int ny = answer[1] + dy[2];
                if(isMovePossible(nx, ny, board)){
                    answer[0] = nx;
                    answer[1] = ny;
                }
            }else{
                int nx = answer[0] + dx[3];
                int ny = answer[1] + dy[3];
                if(isMovePossible(nx, ny, board)){
                    answer[0] = nx;
                    answer[1] = ny;
                }
            }
        }
        
        return answer;
    }
    
    public boolean isMovePossible(int x, int y, int[] board){
        boolean isPossible = true;
        if(Math.abs(x) > board[0] / 2 || Math.abs(y) > board[1] / 2){
            isPossible = false;
        }
        
        return isPossible;
    }
}