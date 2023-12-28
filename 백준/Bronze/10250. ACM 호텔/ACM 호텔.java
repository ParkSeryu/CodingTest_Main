import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            N--;
            int h = 1;
            int w = 1;

            while(N-- > 0){
                h++;
                if(h == H + 1){
                    w++;
                    h = 1;
                }
            }


            if (w < 10) {
                System.out.println(h + "0" + w);
            } else {
                System.out.println(h + ""  + w);
            }

        }
    }
}

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//            bw.write(a + b + "\n");
//            bw.flush();
