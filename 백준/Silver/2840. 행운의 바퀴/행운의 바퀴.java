import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        String[] luckyWheel = new String[N];
        Arrays.fill(luckyWheel, "?");

        String answer = "";

        int idx = -1;
        while (K-- > 0) {
            int S = sc.nextInt();
            String ch = sc.next();
            idx += S;
            while (idx > luckyWheel.length - 1) {
                idx -= luckyWheel.length;
            }
            if (!luckyWheel[idx].equals("?") && !luckyWheel[idx].equals(ch)) {
                answer = "!";
                break;
            }
            luckyWheel[idx] = ch;
        }

        for (int i = 0; i < luckyWheel.length; i++) {
            if (luckyWheel[i].equals("?")) continue;
            for (int j = 0; j < luckyWheel.length; j++) {
                if (i == j || luckyWheel[j].equals("?")) continue;
                if (luckyWheel[i].equals(luckyWheel[j])) {
                    answer = "!";
                    break;
                }
            }
        }

        if (!answer.equals("!")) {
            while (answer.length() < N) {
                answer += luckyWheel[idx--];
                if (idx == -1) {
                    idx = N - 1;
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
