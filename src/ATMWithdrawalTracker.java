import java.util.Scanner;

public class ATMWithdrawalTracker {

    private double accountBalance;
    private double withdrawalAmount;

    public ATMWithdrawalTracker(double accountBalance,
                                double withdrawalAmount) {
        this.accountBalance = accountBalance;
        this.withdrawalAmount = withdrawalAmount;
    }

    public double calculateRemainingBalance() {
        return accountBalance - withdrawalAmount;
    }

    public void displayReport() {
        System.out.println("\n===== ATM WITHDRAWAL REPORT =====");
        System.out.printf("Available Balance: Rs. %.2f%n", accountBalance);
        System.out.printf("Withdrawal Amount: Rs. %.2f%n", withdrawalAmount);

        if (withdrawalAmount > accountBalance) {
            System.out.println("Transaction declined: Insufficient balance.");
        } else {
            System.out.println("Transaction successful.");
            System.out.printf("Remaining Balance: Rs. %.2f%n",
                    calculateRemainingBalance());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid balance.");
            sc.close();
            return;
        }
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double withdrawal = sc.nextDouble();

        if (!Double.isFinite(balance) || !Double.isFinite(withdrawal)
                || balance < 0 || withdrawal <= 0) {
            System.out.println("Please enter valid amounts.");
            sc.close();
            return;
        }

        ATMWithdrawalTracker tracker =
                new ATMWithdrawalTracker(balance, withdrawal);

        tracker.displayReport();
        sc.close();
    }
}

