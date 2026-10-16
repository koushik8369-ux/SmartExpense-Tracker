import java.util.Scanner;

public class FoodExpenseChecker {

    private double budget;
    private double expense;

    public FoodExpenseChecker(double budget, double expense) {
        this.budget = budget;
        this.expense = expense;
    }

    public boolean isWithinBudget() {
        return expense <= budget;
    }

    public double calculateDifference() {
        return Math.abs(budget - expense);
    }

    public void displayResult() {
        if (isWithinBudget()) {
            System.out.println("Food expense is within budget.");
            System.out.printf("Remaining: Rs. %.2f%n", calculateDifference());
        } else {
            System.out.println("Food budget exceeded.");
            System.out.printf("Extra expense: Rs. %.2f%n", calculateDifference());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter food budget: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            sc.close();
            return;
        }
        double budget = sc.nextDouble();

        System.out.print("Enter food expense: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            sc.close();
            return;
        }
        double expense = sc.nextDouble();

        if (budget < 0 || expense < 0) {
            System.out.println("Amounts cannot be negative.");
            sc.close();
            return;
        }

        FoodExpenseChecker checker = new FoodExpenseChecker(budget, expense);
        checker.displayResult();

        sc.close();
    }
}
