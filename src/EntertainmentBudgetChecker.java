import java.util.Scanner;

public class EntertainmentBudgetChecker {

    private double budget;
    private double expense;

    public EntertainmentBudgetChecker(double budget, double expense) {
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
            System.out.println("Expense is within budget.");
            System.out.printf("Remaining budget: Rs. %.2f%n", calculateDifference());
        } else {
            System.out.println("Entertainment budget exceeded.");
            System.out.printf("Extra amount: Rs. %.2f%n", calculateDifference());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter entertainment budget: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            sc.close();
            return;
        }
        double budget = sc.nextDouble();

        System.out.print("Enter entertainment expense: Rs. ");
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

        EntertainmentBudgetChecker checker =
                new EntertainmentBudgetChecker(budget, expense);
        checker.displayResult();

        sc.close();
    }
}
