public class CtoFTable {
    public static void main(String[] args) {
        printCtoFTable();
    }

    /**
     * Prints a Celsius to Fahrenheit conversion table
     *  from 0°C to 100°C in 1-degree increments
     */
    public static void printCtoFTable() {
        System.out.println("Celsius   Fahrenheit");
        for (double c = 0.0; c <= 100.0; c += 1.0) {
            double f = c * 9 / 5 + 32;
            System.out.printf("%7.2f   %10.2f\n", c, f);
        }
    }
}
