import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int answer = 0;

        while(str1.contains(str2)){
            str1 = str1.replaceFirst(str2, "1");
            answer++;
        }

        System.out.println(answer);

    }
}