import java.util.Scanner;

public class MonthlyExpenseSummary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter January expense: ");
        double january = sc.nextDouble();

        System.out.print("Enter February expense: ");
        double february = sc.nextDouble();

        System.out.print("Enter March expense: ");
        double march = sc.nextDouble();

        System.out.print("Enter April expense: ");
        double april = sc.nextDouble();

        double total = january + february + march + april;
        double average = total / 4;

        System.out.println("\n--- Monthly Expense Summary ---");
        System.out.println("Total Expense: Rs. " + total);
        System.out.println("Average Monthly Expense: Rs. " + average);

        sc.close();
    }
}