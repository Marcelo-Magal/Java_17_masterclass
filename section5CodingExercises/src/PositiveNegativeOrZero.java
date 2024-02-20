public class PositiveNegativeZero {
    // write code here

    public static void checkNumber(int number) {

        String polarity = "zero";

        if (number > 0) {
            polarity = "positive";
        } else if (number < 0) {
            polarity =  "negative";
        }

        System.out.println(polarity);
    }
}
