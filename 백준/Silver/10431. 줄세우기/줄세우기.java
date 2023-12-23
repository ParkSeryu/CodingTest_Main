import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();


        for (int cnt = 0; cnt < P; cnt++) {
            int answer = 0;
            int su = sc.nextInt();

            for (int i = 0; i < 20; i++) {
                int A = sc.nextInt();

                for (Integer integer : arr) {
                    if (A < integer) {
                        answer++;
                    }
                }
                arr.add(A);
            }


            System.out.println(su + " " + answer);
            arr.clear();
        }


    }
}
