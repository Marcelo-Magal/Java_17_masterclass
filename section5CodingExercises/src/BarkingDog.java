public class BarkingDog {
    // write code here
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean haveToWakeUp = false;
        // barking = false; Obs: estou atribuindo o valor a barking, apos ser atribuido
        // o valor em shouldWakeUp(); então estou modificando o valor passado, o que não é correto.

        if ((hourOfDay >= 0 && hourOfDay < 8) && barking) {
            haveToWakeUp = true;
            System.out.println(barking);
            System.out.println(hourOfDay);
        } else if ((hourOfDay > 22 && hourOfDay <= 23) && barking) {
            haveToWakeUp = true;
            System.out.println(barking);
            System.out.println(hourOfDay);
        }
        System.out.println(haveToWakeUp);
        return haveToWakeUp;
    }
}