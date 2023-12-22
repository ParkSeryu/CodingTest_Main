import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        str = str.toUpperCase();
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'A']++;
        }
        int max = Arrays.stream(count).max().getAsInt();
        String answer = "";
        boolean flag = false;

        for (int i = 0; i < count.length; i++) {
            if(count[i] == max){
                if(flag){
                    answer = "?";
                    break;
                }
                flag = true;
                max = count[i];
                answer = String.valueOf((char)('A' + i));
            }
        }

        System.out.println(answer);
    }
}