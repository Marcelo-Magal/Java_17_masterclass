public class MethodChallenge2 {

    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
        highScorePosition("Marcelo", position);

        position = calculateHighScorePosition(1000);
        highScorePosition("Marco", position);

        position = calculateHighScorePosition(500);
        highScorePosition("Toe", position);

        position = calculateHighScorePosition(100);
        highScorePosition("Vivi", position);

        position = calculateHighScorePosition(25);
        highScorePosition("Graça", position);
    }

    public static void highScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {

        if (score >= 1000) {
            return  1;
        } else if (500 <= score && score < 1000) {
            return  2;
        } else if (score >= 100 && score < 500) {
            return  3;
        } else {
            return  4;
        }
    }
}
