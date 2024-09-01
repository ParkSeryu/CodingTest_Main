import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> A = new HashSet<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        int M = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }

        // Set
        for (int i : B) {
            if (A.contains(i)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        // binary search

    }
}