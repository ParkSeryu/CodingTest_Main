import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());

		long S[] = new long[suNo + 1];

		stringTokenizer = new StringTokenizer(bf.readLine());

		for (int i = 1; i <= suNo; i++) {
			S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
		}


		for (int i = 1; i <= quizNo; i++) {
			stringTokenizer = new StringTokenizer(bf.readLine());
			int start = Integer.parseInt(stringTokenizer.nextToken());
			int end = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(S[end] - S[start - 1]);
		}
	}
}
