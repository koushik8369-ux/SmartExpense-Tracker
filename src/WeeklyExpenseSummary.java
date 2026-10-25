import java.util.Scanner;

public class WeeklyExpenseSummary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        System.out.println("=== Weekly Expense Summary ===");

        for (int day = 1; day <= 7; day++) {
            System.out.print("Enter expense for day " + day + " (Rs.): ");
            double expense = sc.nextDouble();

            if (expense < 0) {
                System.out.println("Invalid amount! Enter 0 or more.");
                day--;
                continue;
            }

            total += expense;
        }

        double average = total / 7;

        System.out.printf("%nTotal weekly expenses: Rs. %.2f%n", total);
        System.out.printf("Average daily expense: Rs. %.2f%n", average);

        sc.close();
    }
}
