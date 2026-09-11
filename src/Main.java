import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     SMART EXPENSE TRACKER");
        System.out.println("================================");

        System.out.print("Enter monthly income: ");
        double income = scanner.nextDouble();

        if (income <= 0) {
            System.out.println("Monthly income must be greater than zero.");
            scanner.close();
            return;
        }

        System.out.print("Enter food expenses: ");
        double food = scanner.nextDouble();

        System.out.print("Enter travel expenses: ");
        double travel = scanner.nextDouble();

        System.out.print("Enter shopping expenses: ");
        double shopping = scanner.nextDouble();

        System.out.print("Enter bill expenses: ");
        double bills = scanner.nextDouble();

        System.out.print("Enter education expenses: ");
        double education = scanner.nextDouble();

        System.out.print("Enter other expenses: ");
        double others = scanner.nextDouble();

        if (food < 0 || travel < 0 || shopping < 0 ||
                bills < 0 || education < 0 || others < 0) {
            System.out.println("Expense values cannot be negative.");
            scanner.close();
            return;
        }

        double totalExpenses =
                food + travel + shopping + bills + education + others;

        double remainingBalance = income - totalExpenses;

        System.out.println();
        System.out.println("========== MONTHLY SUMMARY ==========");
        System.out.printf("Monthly Income     : Rs. %.2f%n", income);
        System.out.printf("Food Expenses      : Rs. %.2f%n", food);
        System.out.printf("Travel Expenses    : Rs. %.2f%n", travel);
        System.out.printf("Shopping Expenses  : Rs. %.2f%n", shopping);
        System.out.printf("Bill Expenses      : Rs. %.2f%n", bills);
        System.out.printf("Education Expenses : Rs. %.2f%n", education);
        System.out.printf("Other Expenses     : Rs. %.2f%n", others);
        System.out.println("-------------------------------------");
        System.out.printf("Total Expenses     : Rs. %.2f%n", totalExpenses);
        System.out.printf("Remaining Balance  : Rs. %.2f%n", remainingBalance);
        System.out.println("=====================================");

        scanner.close();
    }
}
