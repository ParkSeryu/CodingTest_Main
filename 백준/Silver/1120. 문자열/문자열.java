import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int answer = 0;

        int min = Integer.MAX_VALUE;
        int idx = 0;
        while (B.length() - idx >= A.length()) {
            int temp = 0;
            for (int i = 0; i < A.length(); i++) {
                if (B.charAt(idx + i) != A.charAt(i)) {
                    temp++;
                }
            }
            if (min > temp) {
                min = temp;
            }
            idx++;
        }

        answer = min;

        System.out.println(answer);


    }
}

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//            bw.write(a + b + "\n");
//            bw.flush();