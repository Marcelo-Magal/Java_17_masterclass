public class MegaBytesConverter {
    // write code here
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int megabytes = (kiloBytes / 1024);

        int kilobytes = (kiloBytes % 1024);

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + kilobytes + " KB");
        }
    }
}