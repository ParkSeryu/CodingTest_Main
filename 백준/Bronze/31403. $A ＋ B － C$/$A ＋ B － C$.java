import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void solution(int A, int B, int C) {
        System.out.println(A + B - C);
        System.out.println(Integer.parseInt(String.valueOf(A) + String.valueOf(B)) - C);

    }

    public static void main(String[] args) throws FileNotFoundException {
        // System.setIn(new FileInputStream("src/main/java/sample/input.txt"));
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        Main.solution(A, B, C);
    }
}
