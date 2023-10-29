import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        
        int[] ans = new int[26];

        for (int i = 0; i < S.length(); i++) {
            ans[S.charAt(i) - 'a']++;
        }

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
