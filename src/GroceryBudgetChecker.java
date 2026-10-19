import java.util.Scanner;

public class GroceryBudgetChecker {

    private double budget;
    private double expense;

    public GroceryBudgetChecker(double budget, double expense) {
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

    public void displayResult() {
        System.out.println();
        System.out.println("===== GROCERY BUDGET REPORT =====");
        System.out.printf("Budget            : Rs. %.2f%n", budget);
        System.out.printf("Actual Expense    : Rs. %.2f%n", expense);
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
        }

        System.out.println("=================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grocery budget: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            sc.close();
            return;
        }
        double budget = sc.nextDouble();

        System.out.print("Enter grocery expense: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            sc.close();
            return;
        }
        double expense = sc.nextDouble();

        if (!Double.isFinite(budget) || !Double.isFinite(expense)
                || budget < 0 || expense < 0) {
            System.out.println("Enter finite, non-negative amounts.");
            sc.close();
            return;
        }

        GroceryBudgetChecker checker =
                new GroceryBudgetChecker(budget, expense);
        checker.displayResult();

        sc.close();
    }
}
