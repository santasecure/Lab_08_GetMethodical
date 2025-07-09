import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ask user for a header message
        String headerMessage = SafeInput.getNonZeroLenString(in, "Enter a message to display in the header");

        // Display the pretty header
        SafeInput.prettyHeader(headerMessage);

        in.close();
    }
}
