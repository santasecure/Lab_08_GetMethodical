import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Pseudocode:
        // -- Prompt for birth month using getRangedInt [1-12]
        // -- Use switch() to determine number of days for that month
        // -- Prompt for day using that range
        // -- Prompt for birth year [1950 - 2025]
        // -- Prompt for hour [1 - 24]
        // -- Prompt for minute [0 - 59]
        // -- Display final formatted result

        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        int dayMax;
        switch (month) {
            case 2:
                dayMax = 29; // February
                break;
            case 4: case 6: case 9: case 11:
                dayMax = 30; // April, June, September, November
                break;
            default:
                dayMax = 31; // All others
                break;
        }

        int day = SafeInput.getRangedInt(in, "Enter your birth day", 1, dayMax);
        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2025);
        int hour = SafeInput.getRangedInt(in, "Enter the hour you were born", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter the minute you were born", 0, 59);

        // Output result
        System.out.printf("\nYou were born on %02d/%02d/%d at %02d:%02d\n",
                month, day, year, hour, minute);

        in.close();
    }
}
