import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static boolean[] isEurekaNumber = new boolean[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        getTriangleNumbers(arrayList, 1000);
        preprocess(arrayList);

        int K = sc.nextInt();
        while (K-- > 0) {
            int su = sc.nextInt();
            int answer = isEurekaNumber[su] ? 1 : 0;

            System.out.println(answer);
        }
    }

    public static void getTriangleNumbers(ArrayList<Integer> arrayList, int max) {
        int T = 0;
        int n = 1;
        while (T < max) {
            T = n * (n + 1) / 2;
            arrayList.add(T);
            n++;
        }
    }

    public static void preprocess(ArrayList<Integer> arrayList) {
        boolean[] isSumofTriangle = new boolean[1001];

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(i) + arrayList.get(j) <= 1000) {
                    isSumofTriangle[arrayList.get(i) + arrayList.get(j)] = true;
                }
            }
        }

        for (int i = 1; i < isSumofTriangle.length; i++) {
            if (!isSumofTriangle[i]) continue;
            for (int j = 0; j < arrayList.size(); j++) {
                int eurekaNumber = i + arrayList.get(j);
                if (eurekaNumber > 1000) break;
                isEurekaNumber[eurekaNumber] = true;
            }
        }
    }
}