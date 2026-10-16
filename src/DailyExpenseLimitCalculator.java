import java.util.Scanner;

public class DailyExpenseLimitCalculator {

    private double income;
    private double fixedExpenses;
    private double savingsTarget;
    private int daysInMonth;

    public DailyExpenseLimitCalculator(double income,
            double fixedExpenses, double savingsTarget, int daysInMonth) {
        this.income = income;
        this.fixedExpenses = fixedExpenses;
        this.savingsTarget = savingsTarget;
        this.daysInMonth = daysInMonth;
    }

    public double calculateCommittedAmount() {
        return fixedExpenses + savingsTarget;
    }

    public double calculateFlexibleBudget() {
        return income - calculateCommittedAmount();
    }

    public double calculateDailyLimit() {
        return calculateFlexibleBudget() / daysInMonth;
    }

    public double calculateWeeklyLimit() {
        return calculateDailyLimit() * 7;
    }

    public double calculateSavingsPercentage() {
        return (savingsTarget / income) * 100;
    }

    public double calculateYearlySavings() {
        return savingsTarget * 12;
    }

    public void displayReport() {
        double committed = calculateCommittedAmount();

        System.out.println();
        System.out.println("====================================");
        System.out.println("       DAILY BUDGET REPORT");
        System.out.println("====================================");
        System.out.printf("Monthly Income       : Rs. %.2f%n", income);
        System.out.printf("Fixed Expenses       : Rs. %.2f%n", fixedExpenses);
        System.out.printf("Savings Target       : Rs. %.2f%n", savingsTarget);
        System.out.printf("Savings Percentage   : %.2f%%%n",
                calculateSavingsPercentage());
        System.out.printf("Yearly Savings Goal  : Rs. %.2f%n",
                calculateYearlySavings());
        System.out.println("------------------------------------");

        if (committed > income) {
            System.out.printf("Budget Shortage      : Rs. %.2f%n",
                    committed - income);
            System.out.println("Status: Your plan exceeds your income.");
            System.out.println("Suggestion: Reduce expenses or adjust savings.");
            return;
        }

        System.out.printf("Flexible Budget      : Rs. %.2f%n",
                calculateFlexibleBudget());
        System.out.printf("Weekly Limit         : Rs. %.2f%n",
                calculateWeeklyLimit());
        System.out.printf("Recommended Daily Limit: Rs. %.2f%n",
                calculateDailyLimit());

        if (calculateDailyLimit() >= 1000) {
            System.out.println("Status: Comfortable daily spending limit.");
        } else if (calculateDailyLimit() >= 500) {
            System.out.println("Status: Maintain controlled daily spending.");
        } else {
            System.out.println("Alert: Your daily spending limit is low.");
            System.out.println("Suggestion: Avoid unnecessary purchases.");
        }

        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DAILY EXPENSE LIMIT CALCULATOR");

        System.out.print("Enter monthly income: Rs. ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            scanner.close();
            return;
        }
        double income = scanner.nextDouble();

        System.out.print("Enter fixed monthly expenses: Rs. ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            scanner.close();
            return;
        }
        double fixedExpenses = scanner.nextDouble();

        System.out.print("Enter monthly savings target: Rs. ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            scanner.close();
            return;
        }
        double savingsTarget = scanner.nextDouble();

        System.out.print("Enter number of days in the month: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a whole number of days.");
            scanner.close();
            return;
        }
        int daysInMonth = scanner.nextInt();

        if (!Double.isFinite(income)
                || !Double.isFinite(fixedExpenses)
                || !Double.isFinite(savingsTarget)
                || income <= 0 || fixedExpenses < 0 || savingsTarget < 0) {
            System.out.println("Please enter valid financial amounts.");
            scanner.close();
            return;
        }

        if (daysInMonth < 28 || daysInMonth > 31) {
            System.out.println("Days must be between 28 and 31.");
            scanner.close();
            return;
        }

        DailyExpenseLimitCalculator calculator =
                new DailyExpenseLimitCalculator(
                        income, fixedExpenses, savingsTarget, daysInMonth);

        calculator.displayReport();
        scanner.close();
    }
}
