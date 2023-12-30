import java.util.Scanner;

public class Main {

    public static int checkMate(char[][] board, int row, int column, int answer) {
        int boardW = 0;
        int boardB = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (board[row + i][column + j] != 'W') {
                        boardW += 1;
                    }
                    if (board[row + i][column + j] != 'B') {
                        boardB += 1;
                    }
                } else {
                    if (board[row + i][column + j] != 'B') {
                        boardW += 1;
                    }
                    if (board[row + i][column + j] != 'W') {
                        boardB += 1;
                    }
                }
            }
        }

        return Math.min(boardW, boardB);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int answer = Integer.MAX_VALUE;
        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < M; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int su = checkMate(board, i, j, answer);
                if (answer > su) {
                    answer = su;
                }
            }
        }

        System.out.println(answer);
    }
}

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//            bw.write(a + b + "\n");
//            bw.flush();