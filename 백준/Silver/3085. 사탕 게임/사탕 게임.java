import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static String[][] copyBoard(String[][] board) {
        String[][] copyBoard = new String[board.length][board[0].length];
        for (int i = 0; i < copyBoard.length; i++) {
            System.arraycopy(board[i], 0, copyBoard[i], 0, copyBoard[i].length);
        }
        return copyBoard;
    }

    public static int exchangeBoard(String[][] board) {

        //상, 하, 좌, 우
        int[][] direction = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int max = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                for (int k = 0; k < direction.length; k++) {
                    int dx = i + direction[k][0];
                    int dy = j + direction[k][1];
                    if (dx < 0 || dx >= board.length || dy < 0 || dy >= board.length) {
                        break;
                    }
                    if (!board[i][j].equals(board[dx][dy])) {
                        String[][] copyBoard = copyBoard(board);
                        String temp = copyBoard[i][j];
                        copyBoard[i][j] = copyBoard[dx][dy];
                        copyBoard[dx][dy] = temp;
                        int cnt = countMax(copyBoard);
                        if (max < cnt) {
                            max = cnt;
                        }
                    }
                }
            }
        }
        return max;
    }

    public static int countMax(String[][] board) {
        int max = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int cnt = 1;
                String s = board[i][j];
                for (int k = j + 1; k < board[i].length; k++) {
                    if (s.equals(board[i][k])) {
                        cnt++;
                    } else {
                        break;
                    }
                }
                if (cnt > max) {
                    max = cnt;
                }
            }

            for (int j = 0; j < board[i].length; j++) {
                int cnt = 1;
                String s = board[j][i];
                for (int k = j + 1; k < board[i].length; k++) {
                    if (s.equals(board[k][i])) {
                        cnt++;
                    } else {
                        break;
                    }
                }
                if (cnt > max) {
                    max = cnt;
                }
            }


        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] board = new String[N][N];

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = String.valueOf(str.charAt(j));
            }
        }

        int answer = exchangeBoard(board);
        System.out.println(answer);


    }
}