import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        String[][] castle = new String[N][M];
        int row = 0, col = 0;

        for (int i = 0; i < castle.length; i++) {
            String temp = sc.next();
            if (!temp.contains("X")) row++;
            for (int j = 0; j < castle[i].length; j++) {
                castle[i][j] = String.valueOf(temp.charAt(j));
            }
        }


        for (int i = 0; i < M; i++) {
            String temp = "";
            for (int j = 0; j < N; j++) {
                temp += castle[j][i];
            }
            if(!temp.contains("X")) col++;
        }

        System.out.println(Math.max(row, col));


    }
}
