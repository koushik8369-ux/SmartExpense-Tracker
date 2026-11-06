import java.util.Scanner;

public class AnnualExpenseProjection {

    private double monthlyExpense;

    public AnnualExpenseProjection(double monthlyExpense) {
        this.monthlyExpense = monthlyExpense;
    }

    public double calculateAnnualExpense() {
        return monthlyExpense * 12;
    }

    public double calculateDailyAverage() {
        return calculateAnnualExpense() / 365;
    }

    public double calculateQuarterlyExpense() {
        return monthlyExpense * 3;
    }

    public void displayReport() {
        System.out.println("\n===== ANNUAL EXPENSE PROJECTION =====");
        System.out.printf("Monthly Expense: Rs. %.2f%n", monthlyExpense);
        System.out.printf("Quarterly Expense: Rs. %.2f%n",
                calculateQuarterlyExpense());
        System.out.printf("Annual Expense: Rs. %.2f%n",
                calculateAnnualExpense());
        System.out.printf("Average Daily Expense: Rs. %.2f%n",
                calculateDailyAverage());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your monthly expense: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid amount.");
            sc.close();
            return;
        }

        double expense = sc.nextDouble();

        if (!Double.isFinite(expense) || expense < 0
                || expense > Double.MAX_VALUE / 12) {
            System.out.println("Please enter a valid expense amount.");
            sc.close();
            return;
        }

        AnnualExpenseProjection projection =
                new AnnualExpenseProjection(expense);
        projection.displayReport();
        sc.close();
    }
}
