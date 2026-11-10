import java.util.Scanner;

public class PocketMoneyAllowanceTracker {

    private double monthlyAllowance;
    private double amountSpent;

    public PocketMoneyAllowanceTracker(double monthlyAllowance,
                                       double amountSpent) {
        this.monthlyAllowance = monthlyAllowance;
        this.amountSpent = amountSpent;
    }

    public double calculateRemainingMoney() {
        return monthlyAllowance - amountSpent;
    }

    public double calculateSpendingPercentage() {
        return (amountSpent / monthlyAllowance) * 100;
    }

    public void displayReport() {
        System.out.println("\n===== POCKET MONEY REPORT =====");
        System.out.printf("Monthly Allowance: Rs. %.2f%n", monthlyAllowance);
        System.out.printf("Amount Spent: Rs. %.2f%n", amountSpent);
        System.out.printf("Remaining Money: Rs. %.2f%n",
                calculateRemainingMoney());
        System.out.printf("Spending Percentage: %.2f%%%n",
                calculateSpendingPercentage());

        if (amountSpent > monthlyAllowance) {
            System.out.println("Warning! You exceeded your allowance.");
        } else {
            System.out.println("You are within your allowance.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly pocket money: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double allowance = sc.nextDouble();

        System.out.print("Enter total amount spent: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double spent = sc.nextDouble();

        if (!Double.isFinite(allowance) || !Double.isFinite(spent)
                || allowance <= 0 || spent < 0) {
            System.out.println("Please enter valid amounts.");
            sc.close();
            return;
        }

        PocketMoneyAllowanceTracker tracker =
                new PocketMoneyAllowanceTracker(allowance, spent);

        tracker.displayReport();
        sc.close();
    }
}
