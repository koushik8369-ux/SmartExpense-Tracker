import java.util.Scanner;

public class SavingsRateAnalyzer {

    private double monthlyIncome;
    private double monthlyExpenses;

    public SavingsRateAnalyzer(double monthlyIncome, double monthlyExpenses) {
        this.monthlyIncome = monthlyIncome;
        this.monthlyExpenses = monthlyExpenses;
    }

    public double calculateSavings() {
        return monthlyIncome - monthlyExpenses;
    }

    public double calculateSavingsRate() {
        return (calculateSavings() / monthlyIncome) * 100;
    }

    public double calculateExpenseRate() {
        return (monthlyExpenses / monthlyIncome) * 100;
    }

    public void displayReport() {
        System.out.println("\n===== MONTHLY SAVINGS ANALYSIS =====");
        System.out.printf("Monthly Income: Rs. %.2f%n", monthlyIncome);
        System.out.printf("Monthly Expenses: Rs. %.2f%n", monthlyExpenses);
        System.out.printf("Monthly Savings: Rs. %.2f%n", calculateSavings());
        System.out.printf("Savings Rate: %.2f%%%n", calculateSavingsRate());
        System.out.printf("Expense Rate: %.2f%%%n", calculateExpenseRate());

        if (calculateSavings() < 0) {
            System.out.println("Warning! Expenses are greater than income.");
        } else if (calculateSavingsRate() >= 20) {
            System.out.println("Good! You are maintaining a healthy savings rate.");
        } else {
            System.out.println("Try to increase your monthly savings.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly income: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid income.");
            sc.close();
            return;
        }
        double income = sc.nextDouble();

        System.out.print("Enter monthly expenses: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid expense.");
            sc.close();
            return;
        }
        double expenses = sc.nextDouble();

        if (!Double.isFinite(income) || !Double.isFinite(expenses)
                || income <= 0 || expenses < 0) {
            System.out.println("Please enter valid income and expense amounts.");
            sc.close();
            return;
        }

        SavingsRateAnalyzer analyzer =
                new SavingsRateAnalyzer(income, expenses);

        analyzer.displayReport();
        sc.close();
    }
}
