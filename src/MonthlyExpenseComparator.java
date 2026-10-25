import java.util.Scanner;

public class MonthlyExpenseComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter previous month's expenses (Rs.): ");
        double previousMonth = sc.nextDouble();

        System.out.print("Enter current month's expenses (Rs.): ");
        double currentMonth = sc.nextDouble();

        if (previousMonth < 0 || currentMonth < 0) {
            System.out.println("Expenses cannot be negative.");
        } else {
            double difference = Math.abs(currentMonth - previousMonth);

            System.out.printf("Previous Month: Rs. %.2f%n", previousMonth);
            System.out.printf("Current Month: Rs. %.2f%n", currentMonth);

            if (currentMonth > previousMonth) {
                System.out.printf("Expenses increased by Rs. %.2f%n", difference);
            } else if (currentMonth < previousMonth) {
                System.out.printf("Expenses decreased by Rs. %.2f%n", difference);
            } else {
                System.out.println("Expenses remained the same.");
            }
        }

        sc.close();
    }
}
