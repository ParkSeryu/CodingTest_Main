import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
//    static boolean[] isEurekaNumber = new boolean[1001];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        getTriangleNumbers(arrayList, 1000);
        

        int K = sc.nextInt();
        while (K-- > 0) {
            int su = sc.nextInt();
            int answer = isEurekaNumber(arrayList, su);
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

    public static int isEurekaNumber(ArrayList<Integer> arrayList, int su) {
        int answer = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                for (int k = 0; k < arrayList.size(); k++) {
                    if (arrayList.get(i) + arrayList.get(j) + arrayList.get(k) == su) {
                        answer = 1;
                        break;
                    }
                }
            }
        }

        return answer;
    }
}

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//            bw.write(a + b + "\n");
//            bw.flush();
