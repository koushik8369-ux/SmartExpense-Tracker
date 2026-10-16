import java.util.Scanner;

public class BasicExpenseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter monthly income: ");

        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid income. Please enter a number.");
            scanner.close();
            return;
        }
        double income = scanner.nextDouble();

        System.out.print("Enter total expenses: ");

        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid expenses. Please enter a number.");
            scanner.close();
            return;
        }
        double expenses = scanner.nextDouble();

        if (income < 0 || expenses < 0) {
            System.out.println("Income and expenses cannot be negative.");
            scanner.close();
            return;
        }

        double balance = income - expenses;

        System.out.printf("Remaining balance: Rs. %.2f%n", balance);

        if (expenses > income) {
            System.out.println("Warning: Expenses exceed income!");
        } else if (income > 0 && expenses > income * 0.80) {
            System.out.println("Warning: Expenses are high.");
        } else {
            System.out.println("Spending is under control.");
        }

        scanner.close();
    }
}
