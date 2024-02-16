public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Marcelo");

        Boolean isAlien = false;
        if (isAlien == false) { // é a mesma coisa que !isAlien
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagem";                                                  //condição
        boolean isDomestic = makeOfCar == "Volkswagem" ? false : true; // boolean XXXX = condi == ção ? true : false;
        if (isDomestic) {
            System.out.println("This car is domestic to our country!");
        }  // boleano é Nacional? TEM VALOR DE (fabricado aqui É EQUIVALENTE pela Volks) ? verdadeiro ou falso.
           // como o fabricante é Volks, então é true, que nesse caso corresponde a false. Então imprime "this car is.."
           // IGUAL: boolean isDomestic = (makeOfCar != "Volkswagem");

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double d1 = 20.00d;
        double d2 = 80.00d;
        double remainder = ((d1 +d2) * 100.00d) % 40.00d;
        System.out.println("The total sum is " + (d1 + d2));
        Boolean isNoRemainder = (remainder == 0.00d);   // remainder = result == 0.00 ? true : false;
        System.out.println("The result of the remainder is: " + remainder + " so it is " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder " + remainder);
        }

    }
}
