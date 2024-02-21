public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        int hours = minutes / 60;
        System.out.println("hours = " + hours);

        int remainingMinutes = minutes % 60;
        System.out.println("minutes = " + minutes);
        System.out.println("remaining minutes = " + remainingMinutes);

        int remainingSeconds = seconds % 60;
        System.out.println("seconds = " + seconds);
        System.out.println("remaining seconds = " + remainingSeconds);
        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }


    public static String getDurationString(int minutes, int seconds) {
        return "";
    }
}
