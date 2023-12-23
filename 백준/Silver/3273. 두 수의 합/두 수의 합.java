import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int answer = 0;
        int start = 0;
        int end = arr.length - 1;

        Arrays.sort(arr);

        while(start < end){
            if(arr[start] + arr[end] == x){
                answer++;
                start++;
                end--;
            }
            else if(arr[start] + arr[end] > x){
                end--;
            }
            else{
                start++;
            }
        }

        System.out.println(answer);
    }

}