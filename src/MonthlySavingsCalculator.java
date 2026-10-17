import java.util.Scanner;

public class MonthlySavingsCalculator {

    private double income;
    private double expenses;

    public MonthlySavingsCalculator(double income, double expenses) {
        this.income = income;
        this.expenses = expenses;
    }

    public double calculateSavings() {
        return income - expenses;
    }

    public double calculateSavingsPercentage() {
        return calculateSavings() / income * 100;
    }

    public void displayReport() {
        double savings = calculateSavings();

        System.out.println();
        System.out.println("----- MONTHLY SAVINGS REPORT -----");
        System.out.printf("Monthly Income      : Rs. %.2f%n", income);
        System.out.printf("Monthly Expenses    : Rs. %.2f%n", expenses);
        System.out.printf("Monthly Savings     : Rs. %.2f%n", savings);
        System.out.printf("Savings Percentage  : %.2f%%%n",
                calculateSavingsPercentage());

        if (savings > 0) {
            System.out.println("Status: You saved money this month.");
        } else if (savings == 0) {
            System.out.println("Status: Income and expenses are equal.");
        } else {
            System.out.printf("Warning: You overspent by Rs. %.2f%n",
                    Math.abs(savings));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly income: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            sc.close();
            return;
        }
        double income = sc.nextDouble();

        System.out.print("Enter monthly expenses: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            sc.close();
            return;
        }
        double expenses = sc.nextDouble();

        if (!Double.isFinite(income) || !Double.isFinite(expenses)
                || income <= 0 || expenses < 0) {
            System.out.println("Income must be positive and expenses cannot be negative.");
            sc.close();
            return;
        }

        MonthlySavingsCalculator calculator =
                new MonthlySavingsCalculator(income, expenses);
        calculator.displayReport();

        sc.close();
    }
}
