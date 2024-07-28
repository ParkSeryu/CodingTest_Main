import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String answer = "";
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < N; i++) {
			String str = sc.next();
			map.put(str, map.getOrDefault(str, 1) + 1);
		}

		Integer maxValue = Collections.max(map.values());
		List<String> keySet = new ArrayList<>(map.keySet());
		Collections.sort(keySet);

		for (String key : keySet) {
			if (map.get(key) == maxValue) {
				answer = key;
				break;
			}
		}

		System.out.println(answer);

	}

}
