import java.util.Scanner;

public class BasicExpenseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter monthly income: ");
        double income = scanner.nextDouble();

        System.out.print("Enter total expenses: ");
        double expenses = scanner.nextDouble();

        double balance = income - expenses;

        System.out.println("Remaining balance: " + balance);

        if (expenses > income) {
            System.out.println("Warning: Expenses exceed income!");
        } else if (expenses > income * 0.80) {
            System.out.println("Warning: Expenses are high.");
        } else {
            System.out.println("Spending is under control.");
        }

        scanner.close();
    }
}