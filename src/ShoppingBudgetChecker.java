import java.util.Scanner;

public class ShoppingBudgetChecker {

    private double budget;
    private double amount;

    public ShoppingBudgetChecker(double budget, double amount) {
        this.budget = budget;
        this.amount = amount;
    }

    public boolean isWithinBudget() {
        return amount <= budget;
    }

    public double calculateDifference() {
        return Math.abs(budget - amount);
    }

    public void displayResult() {
        if (isWithinBudget()) {
            System.out.println("Shopping is within your budget.");
            System.out.printf("Remaining budget: Rs. %.2f%n",
                    calculateDifference());
        } else {
            System.out.println("Shopping exceeds your budget.");
            System.out.printf("Extra amount needed: Rs. %.2f%n",
                    calculateDifference());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your shopping budget: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            sc.close();
            return;
        }
        double budget = sc.nextDouble();

        System.out.print("Enter shopping amount: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            sc.close();
            return;
        }
        double amount = sc.nextDouble();

        if (!Double.isFinite(budget) || !Double.isFinite(amount)
                || budget < 0 || amount < 0) {
            System.out.println("Enter valid, non-negative amounts.");
            sc.close();
            return;
        }

        ShoppingBudgetChecker checker =
                new ShoppingBudgetChecker(budget, amount);
        checker.displayResult();

        sc.close();
    }
}
