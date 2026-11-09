import java.util.Scanner;

public class PettyCashBalanceTracker {

    private double openingBalance;
    private double cashReceived;
    private double cashSpent;

    public PettyCashBalanceTracker(double openingBalance,
                                   double cashReceived, double cashSpent) {
        this.openingBalance = openingBalance;
        this.cashReceived = cashReceived;
        this.cashSpent = cashSpent;
    }

    public double calculateTotalCash() {
        return openingBalance + cashReceived;
    }

    public double calculateClosingBalance() {
        return calculateTotalCash() - cashSpent;
    }

    public void displayReport() {
        System.out.println("\n===== PETTY CASH REPORT =====");
        System.out.printf("Opening Balance: Rs. %.2f%n", openingBalance);
        System.out.printf("Cash Received: Rs. %.2f%n", cashReceived);
        System.out.printf("Total Available Cash: Rs. %.2f%n",
                calculateTotalCash());
        System.out.printf("Cash Spent: Rs. %.2f%n", cashSpent);

        if (calculateClosingBalance() >= 0) {
            System.out.printf("Closing Balance: Rs. %.2f%n",
                    calculateClosingBalance());
        } else {
            System.out.printf("Cash Shortage: Rs. %.2f%n",
                    Math.abs(calculateClosingBalance()));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter opening cash balance: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double opening = sc.nextDouble();

        System.out.print("Enter cash received: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double received = sc.nextDouble();

        System.out.print("Enter cash spent: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double spent = sc.nextDouble();

        if (!Double.isFinite(opening) || !Double.isFinite(received)
                || !Double.isFinite(spent) || opening < 0
                || received < 0 || spent < 0
                || opening > Double.MAX_VALUE - received) {
            System.out.println("Please enter valid cash amounts.");
            sc.close();
            return;
        }

        PettyCashBalanceTracker tracker =
                new PettyCashBalanceTracker(opening, received, spent);

        tracker.displayReport();
        sc.close();
    }
}
