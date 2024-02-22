public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean catsArePlaying;
        if (summer && ((temperature >= 25) && (temperature <= 45))) {
            return catsArePlaying = true;
        } else if ((temperature >= 25) && (temperature <= 35)) {
            return catsArePlaying = true;
        } else {
            return catsArePlaying = false;
        }
    }
}
