import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S1 = sc.nextInt();
        int S2 = sc.nextInt();
        int S3 = sc.nextInt();

        int[] dice = new int[S1 + S2 + S3];

        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    dice[(i + j + k) - 1]++;
                }
            }
        }

        int max = -1;
        int ans = -1;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] > max) {
                max = dice[i];
                ans = i;
            }
        }

        System.out.println(ans + 1);

    }
}

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//            bw.write(a + b + "\n");
//            bw.flush();