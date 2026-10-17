import java.util.Scanner;

public class GroceryBudgetCalculator {

    private double budget;
    private double spending;

    public GroceryBudgetCalculator(double budget, double spending) {
        this.budget = budget;
        this.spending = spending;
    }

    public double calculateRemaining() {
        return budget - spending;
    }

    public void displaySummary() {
        double remaining = calculateRemaining();

        System.out.println();
        System.out.println("--- Grocery Budget Summary ---");
        System.out.printf("Budget            : Rs. %.2f%n", budget);
        System.out.printf("Spending          : Rs. %.2f%n", spending);

        if (remaining > 0) {
            System.out.printf("Remaining Budget  : Rs. %.2f%n", remaining);
            System.out.println("Status: Within Budget");
        } else if (remaining == 0) {
            System.out.println("Remaining Budget  : Rs. 0.00");
            System.out.println("Status: Budget Fully Used");
        } else {
            System.out.printf("Exceeded Amount   : Rs. %.2f%n", Math.abs(remaining));
            System.out.println("Status: Budget Exceeded");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your grocery budget: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            sc.close();
            return;
        }
        double budget = sc.nextDouble();

        System.out.print("Enter your grocery spending: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            sc.close();
            return;
        }
        double spending = sc.nextDouble();

        if (!Double.isFinite(budget) || !Double.isFinite(spending)
                || budget < 0 || spending < 0) {
            System.out.println("Amounts must be valid and non-negative.");
            sc.close();
            return;
        }

        GroceryBudgetCalculator calculator =
                new GroceryBudgetCalculator(budget, spending);
        calculator.displaySummary();
        sc.close();
    }
}
