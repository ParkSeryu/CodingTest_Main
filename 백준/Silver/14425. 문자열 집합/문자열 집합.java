import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }

        int result = 0;
        for(int i = 0; i < M; i++){
            String str = sc.next();
            for(int j = 0; j < N; j++){
                if(S[j].equals(str)){
                    result++;
                    break;
                }
            }
        }


        System.out.println(result);
    }
}