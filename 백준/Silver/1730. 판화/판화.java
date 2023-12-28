import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean isCorrect(int dx, int dy, int N) {
        return dx > -1 && dx < N && dy > -1 && dy < N;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        char[][] board = new char[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = '.';
            }
        }

        String str = br.readLine();

        int[][] command = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int row = 0;
        int col = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int dx = 0;
            int dy = 0;
            if (ch == 'U') {
                dx = row + command[0][0];
                dy = col + command[0][1];
                if (isCorrect(dx, dy, N)) {
                    if (board[row][col] == '-')
                        board[row][col] = '+';
                    else if (board[row][col] == '.')
                        board[row][col] = '|';

                    if (board[dx][dy] == '-') {
                        board[dx][dy] = '+';
                    } else if (board[dx][dy] == '.') {
                        board[dx][dy] = '|';
                    }

                    row = dx;
                    col = dy;
                }
            } else if (ch == 'D') {
                dx = row + command[1][0];
                dy = col + command[1][1];
                if (isCorrect(dx, dy, N)) {
                    if (board[row][col] == '-')
                        board[row][col] = '+';
                    else if (board[row][col] == '.')
                        board[row][col] = '|';
                    if (board[dx][dy] == '-')
                        board[dx][dy] = '+';
                    else if (board[dx][dy] == '.')
                        board[dx][dy] = '|';
                    row = dx;
                    col = dy;
                }
            } else if (ch == 'L') {
                dx = row + command[2][0];
                dy = col + command[2][1];
                if (isCorrect(dx, dy, N)) {
                    if (board[row][col] == '|')
                        board[row][col] = '+';
                    else if (board[row][col] == '.')
                        board[row][col] = '-';
                    if (board[dx][dy] == '|')
                        board[dx][dy] = '+';
                    else if (board[dx][dy] == '.')
                        board[dx][dy] = '-';
                    row = dx;
                    col = dy;
                }
            } else {
                dx = row + command[3][0];
                dy = col + command[3][1];
                if (isCorrect(dx, dy, N)) {
                    if (board[row][col] == '|')
                        board[row][col] = '+';
                    else if (board[row][col] == '.')
                        board[row][col] = '-';
                    if (board[dx][dy] == '|')
                        board[dx][dy] = '+';
                    else if (board[dx][dy] == '.')
                        board[dx][dy] = '-';
                    row = dx;
                    col = dy;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//            bw.write(a + b + "\n");
//            bw.flush();
