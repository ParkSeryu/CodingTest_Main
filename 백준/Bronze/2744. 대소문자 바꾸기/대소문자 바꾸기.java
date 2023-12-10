import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String answer = "";
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) >= 'a'){
                answer += (char)(word.charAt(i) - 32);
            }else{
                answer += (char)(word.charAt(i) + 32);
            }
        }

        System.out.println(answer);
    }
}
