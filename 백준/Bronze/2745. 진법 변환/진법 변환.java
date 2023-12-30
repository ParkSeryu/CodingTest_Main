import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();
        long answer = 0;
        int jisu = 0;
        for (int i = 1; i <= N.length(); i++) {
            char ch = N.charAt(N.length() - i);
            int temp;
            if (ch >= 'A') {
                temp = (ch - 'A') + 10;
            } else {
                temp = ch - '0';
            }
//            System.out.println(temp);
            answer += (int) (temp * Math.pow(B, jisu++));
        }
        System.out.println(answer);
    }
}

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//            bw.write(a + b + "\n");
//            bw.flush();