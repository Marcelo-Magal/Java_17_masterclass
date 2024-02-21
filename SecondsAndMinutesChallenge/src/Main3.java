public class Main3 {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(-65, -45));
    }

    public static String getDurationString(int seconds) {
       if (seconds <= 0) {
           return "This is an invalid seconds number";
       }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes <= 0) {
            return "This is an invalid minutes number";
        }

        if ((seconds <= 0) || (seconds >= 59)) {
            return "This is an invalid seconds number";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        //int remainingSeconds = seconds % 60; pois a validação ja impede minutes > 60.

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

}


