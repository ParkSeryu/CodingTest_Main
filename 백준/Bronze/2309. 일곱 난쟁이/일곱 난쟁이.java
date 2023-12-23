import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int[] answer = new int[7];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int save1 = -1;
        int save2 = -1;



        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    save1 = i;
                    save2 = j;
                    break;
                }
            }
        }
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(i == save1 || i == save2){
                continue;
            }
            answer[idx++] = arr[i];
        }

        Arrays.sort(answer);

        for(Integer each : answer){
            System.out.println(each);
        }

    }

}