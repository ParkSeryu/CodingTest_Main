import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static String solution(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        }

        if (num % 3 == 0) {
            return "Fizz";
        }

        if (num % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(num);
    }

    public static void main(String[] args) throws FileNotFoundException {
        // System.setIn(new FileInputStream("src/main/java/sample/input.txt"));
        Scanner sc = new Scanner(System.in);
        String[] array = new String[3];
        array[0] = sc.next();
        array[1] = sc.next();
        array[2] = sc.next();

        for (int i = 0; i < array.length; i++) {
            try {
                int num = Integer.parseInt(array[i]);
                System.out.println(Main.solution(3 - i + num));
                break;
            } catch (NumberFormatException ignored) {
                continue;
            }
        }
    }
}
