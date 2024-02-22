public class PlayingCat2 {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int maxTemp = summer ? 45 : 35;
        return temperature >= 25 && temperature <= maxTemp;
    }
}
