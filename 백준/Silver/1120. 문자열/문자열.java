import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        int length = str2.length() - str1.length();
		int min = 51;

		for (int i = 0; i <= length; i++) {
			int cnt = 0;
			for (int j = 0; j < str1.length(); j++) {
				if (str1.charAt(j) != str2.charAt(i + j)) {
					cnt++;
				}

			}
			if (min > cnt) {
				min = cnt;
			}
		}
		
		System.out.println(min);
    }
}