public class TeenNumberChecker {
    // write code here
    public static boolean hasTeen(int n1, int n2, int n3) {
        return isTeen(n1) || isTeen(n2) || isTeen(n3);
    }

    public static boolean isTeen(int number) {
        return number >= 13 && number <= 19;
    }

}