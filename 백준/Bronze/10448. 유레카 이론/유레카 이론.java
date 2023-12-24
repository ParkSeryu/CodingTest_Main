import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        while (K-- > 0) {
            int answer = 0;
            int su = sc.nextInt();

            ArrayList<Integer> arrayList = new ArrayList<>();

            int n = 1;
            int T = 0;
            while (T < su) {
                T = n * (n + 1) / 2;
                arrayList.add(T);
                n++;
            }

            for(int i = 0; i < arrayList.size(); i++){
                for(int j = 0; j < arrayList.size(); j++){
                    for(int k = 0; k < arrayList.size(); k++){
                        if(arrayList.get(i) + arrayList.get(j) + arrayList.get(k) == su){
                            answer = 1;
                            break;
                        }
                    }
                }
            }

            System.out.println(answer);

        }

    }

}