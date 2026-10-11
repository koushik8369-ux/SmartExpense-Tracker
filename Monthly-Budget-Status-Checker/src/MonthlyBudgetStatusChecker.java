import java.util.Scanner;

public class MonthlyBudgetStatusChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly budget (Rs.): ");
        double budget = sc.nextDouble();

        System.out.print("Enter total expenses (Rs.): ");
        double expenses = sc.nextDouble();

        if (budget < 0 || expenses < 0) {
            System.out.println("Amounts cannot be negative.");
        } else if (expenses > budget) {
            System.out.printf("Over budget by Rs. %.2f%n", expenses - budget);
        } else {
            System.out.printf("Remaining budget: Rs. %.2f%n", budget - expenses);
        }

        sc.close();
    }
}