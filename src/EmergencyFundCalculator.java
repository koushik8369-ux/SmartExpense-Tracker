import java.util.Scanner;

public class EmergencyFundCalculator {

    private double monthlyExpenses;
    private double currentFund;
    private int coverageMonths;

    public EmergencyFundCalculator(double monthlyExpenses,
            double currentFund, int coverageMonths) {
        this.monthlyExpenses = monthlyExpenses;
        this.currentFund = currentFund;
        this.coverageMonths = coverageMonths;
    }

    public double calculateRequiredFund() {
        return monthlyExpenses * coverageMonths;
    }

    public double calculateRemainingAmount() {
        return Math.max(0, calculateRequiredFund() - currentFund);
    }

    public double calculateProgress() {
        return Math.min(100, currentFund / calculateRequiredFund() * 100);
    }

    public void displayReport() {
        double progress = calculateProgress();

        System.out.println();
        System.out.println("------- EMERGENCY FUND REPORT -------");
        System.out.printf("Monthly Expenses : Rs. %.2f%n", monthlyExpenses);
        System.out.printf("Coverage Period  : %d month(s)%n", coverageMonths);
        System.out.printf("Required Fund    : Rs. %.2f%n", calculateRequiredFund());
        System.out.printf("Current Fund     : Rs. %.2f%n", currentFund);
        System.out.printf("Fund Progress    : %.2f%%%n", progress);
        System.out.printf("Remaining Amount : Rs. %.2f%n", calculateRemainingAmount());

        if (calculateRemainingAmount() == 0) {
            System.out.println("Status: Emergency fund target achieved!");
        } else if (progress >= 75) {
            System.out.println("Status: You are close to your target.");
        } else if (progress >= 40) {
            System.out.println("Status: Your emergency fund is growing.");
        } else {
            System.out.println("Status: Prioritize building your emergency fund.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly essential expenses: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Enter a valid number.");
            sc.close();
            return;
        }
        double expenses = sc.nextDouble();

        System.out.print("Enter current emergency savings: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Enter a valid number.");
            sc.close();
            return;
        }
        double fund = sc.nextDouble();

        System.out.print("Enter desired coverage in months (3 to 12): ");
        if (!sc.hasNextInt()) {
            System.out.println("Enter a whole number of months.");
            sc.close();
            return;
        }
        int months = sc.nextInt();

        if (!Double.isFinite(expenses) || !Double.isFinite(fund)
                || expenses <= 0 || fund < 0) {
            System.out.println("Enter valid, non-negative financial amounts.");
            sc.close();
            return;
        }

        if (months < 3 || months > 12) {
            System.out.println("Coverage must be between 3 and 12 months.");
            sc.close();
            return;
        }

        EmergencyFundCalculator calculator =
                new EmergencyFundCalculator(expenses, fund, months);
        calculator.displayReport();
        sc.close();
    }
}
