public class Main {
    public static void main(String[] args) {
        System.out.println("5 ft, 8in = " + convertToCentimeters(5, 8) + "cm.");
    }

    public static double convertToCentimeters(int heightInInches) {
        double heightInCentimeters = heightInInches * 2.54;
        return heightInCentimeters;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeghtInInches) {
        int heightInInches = heightInFeet * 12;
        int totalHeightInInches = heightInInches + remainingHeghtInInches;
        double result = convertToCentimeters(totalHeightInInches);
        return result;
    }
}
