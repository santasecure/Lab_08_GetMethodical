import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Pseudocode:
        // -- Prompt for a favorite integer using SafeInput
        // -- Prompt for a favorite double using SafeInput
        // -- Display both values

        int favInt = SafeInput.getInt(in, "Enter your favorite integer");
        double favDouble = SafeInput.getDouble(in, "Enter your favorite decimal number");

        System.out.println("\nYour favorite integer is: " + favInt);
        System.out.println("Your favorite decimal number is: " + favDouble);

        in.close();
    }
}
