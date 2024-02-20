public class DecimalComparator {
    // write code here
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        long number1Rounded = (long) (number1 * 1000.0);
        long number2Rounded = (long) (number2 * 1000.0);

        if (number1Rounded == number2Rounded) {
            return true;
        } else {
            return false;
        }
    }
}