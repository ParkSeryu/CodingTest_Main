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

    public static String convertTimeNumberArray(int nowTimeNum, int saltTimeNum){
        int time = saltTimeNum - nowTimeNum;
        if(time < 0){
            time = (3600 * 24) + time;
        }

        if(time == 0){
            time = 3600 * 24;
        }

        String hour = String.valueOf(time / 3600);
        if(hour.length() == 1) hour = "0" + hour;
        String minute = String.valueOf(time % 3600 / 60);
        if(minute.length() == 1) minute = "0" + minute;
        String second = String.valueOf(time % 3600 % 60);
        if(second.length() == 1) second = "0" + second;
        return hour + ":" + minute + ":" + second;
    }
}
