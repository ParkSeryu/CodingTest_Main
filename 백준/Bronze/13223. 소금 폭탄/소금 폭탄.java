import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nowTime = sc.next();
        String saltTime = sc.next();

        String[] nowTimeArray = convertTimeArray(nowTime);
        String[] saltTimeArray = convertTimeArray(saltTime);

        int nowTimeNumber = convertTimeNumber(nowTimeArray);
        int saltTimeNumber = convertTimeNumber(saltTimeArray);

        String answer = convertTimeNumberArray(nowTimeNumber, saltTimeNumber);

        System.out.println(answer);
    }

    public static String[] convertTimeArray(String time) {
        return time.split(":");
    }

    public static int convertTimeNumber(String[] timeArray) {
        return (Integer.parseInt(timeArray[0]) * 3600) + (Integer.parseInt(timeArray[1]) * 60) + (Integer.parseInt(timeArray[2]));
    }

    public static String convertTimeNumberArray(int nowTimeNum, int saltTimeNum) {
        int time = saltTimeNum - nowTimeNum;
        if (time < 0) {
            time = (3600 * 24) + time;
        }

        if (time == 0) {
            time = 3600 * 24;
        }

        int hour = time / 3600;
        int minute = time % 3600 / 60;
        int second = time % 3600 % 60;
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
