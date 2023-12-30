import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean isSuccess = false;
        int su = N;
        int cnt = 0;
        while (!isSuccess) {
            cnt++;
            su = Integer.parseInt(String.valueOf((su % 10)) + String.valueOf(((su / 10) + (su % 10)) % 10));
            if (su == N) {
                isSuccess = true;
            }
        }
        System.out.println(cnt);

    }
}

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//            bw.write(a + b + "\n");
//            bw.flush();