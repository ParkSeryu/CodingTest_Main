import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();

        HashMap<Integer, String> mappingName = new HashMap<>();
        HashMap<String, Integer> mappingScore = new HashMap<>();
        double[][] score = new double[N][14];
        int idx = 0;

        while (N-- > 0) {
            String staffName = sc.next();
            int voteCnt = sc.nextInt();

            if (voteCnt >= (X / 100 * 5)) {
                int j = 1;
                for (int i = 0; i < 14; i++) {
                    score[idx][i] = (double) voteCnt / j;
                    j++;
                }
                mappingName.put(idx, staffName);
                mappingScore.put(staffName, 0);
                idx++;
            }
        }

        int cnt = 0;
        while (cnt != 14) {
            double max = -1;
            int maxRow = -1;
            int maxCol = -1;
            for (int i = 0; i < score.length; i++) {
                for (int j = 0; j < score[i].length; j++) {
                    if (score[i][j] > max) {
                        max = score[i][j];
                        maxRow = i;
                        maxCol = j;
                    }
                }
            }
            score[maxRow][maxCol] = -1;
            String name = mappingName.get(maxRow);
            mappingScore.put(name,
                    mappingScore.get(name) + 1);
            cnt++;
        }

        for(Map.Entry<String, Integer> entry : mappingScore.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//            bw.write(a + b + "\n");
//            bw.flush();