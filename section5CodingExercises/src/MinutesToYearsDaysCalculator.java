public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            //long remainingHours = minutes % 60;          Como é long, já vai sair o número
            //long totalHours = (hours + remainingHours);  quebrado, então não preciso de remeinder
                                                           // Alám disso min, hs e dias são múltiplos
            long days = hours / 24;                        // e não precisam de resto, pois o num quebrado
            // long remainingDays = totalHours % 24;        já conta para a divisão da próxima varável,
           // long totalDays = (days + remainingDays);      diferente de Anos.

            long years = days / 24;
            long remainingYears = days % 24;
            long totalYears = (years + remainingYears);

            System.out.println(minutes + " min = " + totalYears + " y and " + totalDays + " d");
        }
    }
}
