import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Pseudocode:
        // -- Prompt for SSN using regex pattern ^\d{3}-\d{2}-\d{4}$
        // -- Prompt for UC M number using ^(M|m)\d{5}$
        // -- Prompt for menu choice using ^[OoSsVvQq]$
        // -- Display each value entered

        String ssn = SafeInput.getRegExString(in, "Enter your SSN (format: ###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNumber = SafeInput.getRegExString(in, "Enter your UC M number (format: M12345)", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(in, "Enter menu choice [O, S, V, Q]", "^[OoSsVvQq]$");

        // Output confirmation
        System.out.println("\nYour SSN: " + ssn);
        System.out.println("Your M number: " + mNumber);
        System.out.println("Your menu choice: " + menuChoice);

        in.close();
    }
}
