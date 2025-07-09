import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Pseudocode:
        // -- Initialize total to 0
        // -- Loop:
        //    -- Ask if user wants to add another item (Y/N)
        //    -- If yes: prompt for price using getRangedDouble (0.50 to 9.99)
        //       -- Add to total
        //    -- If no: break
        // -- Output final total

        final double MAX_BUDGET = 10.00;
        double runningTotal = 0.0;
        boolean moreItems = true;

        while (moreItems && runningTotal < MAX_BUDGET) {
            moreItems = SafeInput.getYNConfirm(in, "Do you want to add an item?");

            if (moreItems) {
                double itemPrice = SafeInput.getRangedDouble(in, "Enter item price", 0.50, 9.99);
                if (runningTotal + itemPrice > MAX_BUDGET) {
                    System.out.println("That item would put you over the $10 limit! Try something cheaper.");
                } else {
                    runningTotal += itemPrice;
                }
            }
        }

        System.out.printf("\nTotal cost: $%.2f\n", runningTotal);
        in.close();
    }
}

