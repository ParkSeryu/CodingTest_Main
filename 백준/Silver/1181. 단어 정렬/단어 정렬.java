import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];

        int idx = 0;
        while (N-- > 0) {
            String str = sc.next();
            arr[idx++] = str;
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();

            }
        });

        for(int i = 0; i < arr.length; i++){
            if(i == 0) System.out.println(arr[i]);
            else if(!arr[i - 1].equals(arr[i])){
                System.out.println(arr[i]);
            }
        }

    }
}