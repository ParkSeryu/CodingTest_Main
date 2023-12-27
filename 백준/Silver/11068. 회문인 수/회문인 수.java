import java.util.Scanner;

public class Main {

    public static int convertBase(int data) {
        int result = 0;
        for (int i = 2; i <= 64; i++) {
            StringBuilder answer = new StringBuilder();
            int N = data;
            while (N > 0) {
                int temp = N % i;
                if (temp >= 10) {
                    char ch = (char) ('A' + (temp - 10));
                    answer.append(ch);
                } else {
                    answer.append(temp);
                }
                N /= i;
            }

            if (isPalindrome(answer)) {
                result = 1;
                break;
            }


        }
        return result;
    }

    public static boolean isPalindrome(StringBuilder str) {
        String reverse = String.valueOf(str);
        str.reverse();
        return String.valueOf(str).equals(reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int data = sc.nextInt();
            int answer;
            answer = convertBase(data);
            System.out.println(answer);
        }

    }
}