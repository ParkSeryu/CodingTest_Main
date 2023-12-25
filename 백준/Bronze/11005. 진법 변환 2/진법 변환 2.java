import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        StringBuilder answer = new StringBuilder();

        while (N > 0) {
            int temp = N % B;
            if (temp >= 10) {
                char ch = (char) ('A' + (temp - 10));
                answer.append(ch);
            } else {
                answer.append(temp);
            }

            N /= B;
        }

        answer.reverse();

        System.out.println(answer);

    }
}