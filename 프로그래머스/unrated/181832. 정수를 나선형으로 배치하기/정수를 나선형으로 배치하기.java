class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int su = 1;
        // R, D, L, U
        int[] direction_x = {0, -1, 0, 1};
        int[] direction_y = {1, 0, -1, 0}; 
        
        int x = 0;
        int y = 0;
        int i = 0;
        
        while(su < n * n){
            int nx = x + direction_x[i];
            int ny = y + direction_y[i];

            if (nx < 0 || ny < 0 || nx > n - 1 || ny > n - 1 || answer[nx][ny] != 0){
                i += 1;
                if(i % 4 == 0){
                    i = 0;
                }
                continue;
            }

            answer[x][y] = su++;
            x = nx;
            y = ny;
        }
        
        answer[x][y] = su++;
        return answer;
    }
}