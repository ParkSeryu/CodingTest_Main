public class Main {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(1);
        while (n++ <= 10000) {
            boolean isSelfNumber = true;
            for(int i = 1; i < n; i++){
                int selfNumber = i;
                int temp = i;
                while(temp > 0){
                    selfNumber += temp % 10;
                    temp /= 10;
                }
                if(selfNumber == n){
                    isSelfNumber = false;
                    break;
                }
            }
            if(isSelfNumber){
                System.out.println(n);
            }
        }


    }
}

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//            bw.write(a + b + "\n");
//            bw.flush();