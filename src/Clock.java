
public class Clock {

    public static void main(String[] args) {
        int result = getSecond(18,32,47);
        System.out.println(result + "秒");
    }

    public static int getSecond(int hour, int minute ,int second) {
        int secondHour = hour * 60 * 60;
        int secondMinute = minute * 60;
        int result = secondHour + secondMinute + second;
        return result;
    }

}
