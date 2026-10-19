import java.util.Scanner;

public class TravelExpenseChecker {

    private double budget;
    private double expense;

    public TravelExpenseChecker(double budget, double expense) {
        this.budget = budget;
        this.expense = expense;
    }

    public boolean isWithinBudget() {
        return expense <= budget;
    }

    public double calculateDifference() {
        return Math.abs(budget - expense);
    }

    public double calculateUtilization() {
        if (budget == 0) {
            return expense == 0 ? 0 : 100;
        }
        return (expense / budget) * 100;
    }

    public void displayReport() {
        System.out.println();
        System.out.println("===== TRAVEL EXPENSE REPORT =====");
        System.out.printf("Travel Budget     : Rs. %.2f%n", budget);
        System.out.printf("Travel Expense    : Rs. %.2f%n", expense);
        System.out.printf("Budget Utilization: %.2f%%%n",
                calculateUtilization());

        if (isWithinBudget()) {
            System.out.printf("Remaining Amount  : Rs. %.2f%n",
                    calculateDifference());
            System.out.println("Status: Within Budget");
        } else {
            System.out.printf("Exceeded Amount   : Rs. %.2f%n",
                    calculateDifference());
            System.out.println("Status: Budget Exceeded");
            System.out.println("Suggestion: Review optional travel expenses.");
        }

        System.out.println("=================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter travel budget: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid budget.");
            sc.close();
            return;
        }
        double budget = sc.nextDouble();

        System.out.print("Enter travel expense: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid expense.");
            sc.close();
            return;
        }
        double expense = sc.nextDouble();

        if (!Double.isFinite(budget) || !Double.isFinite(expense)
                || budget < 0 || expense < 0) {
            System.out.println("Amounts must be valid and non-negative.");
            sc.close();
            return;
        }

        TravelExpenseChecker checker =
                new TravelExpenseChecker(budget, expense);
        checker.displayReport();

        sc.close();
    }
}
