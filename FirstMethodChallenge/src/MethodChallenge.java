public class MethodChallenge {

    public static void main(String[] args) {

        highScorePosition("Marcelo", calculateHighScorePosition(1500));
    }

    public static void highScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {

        int result;

        if (score >= 1000) {
            result = 1;

        } else if (500 <= score && score < 1000) {
            result = 2;

        } else if (score >= 100 && score < 500) {
            result = 3;

        } else {
            result = 4;
        }

        return result;
    }
}
