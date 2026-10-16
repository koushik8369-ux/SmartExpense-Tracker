import java.util.Scanner;

public class MobileRechargeChecker {

    private double recharge;
    private double balance;

    public MobileRechargeChecker(double recharge, double balance) {
        this.recharge = recharge;
        this.balance = balance;
    }

    public boolean canRecharge() {
        return balance >= recharge;
    }

    public double calculateDifference() {
        return Math.abs(balance - recharge);
    }

    public void displayResult() {
        if (canRecharge()) {
            System.out.println("Recharge can be completed.");
            System.out.printf("Remaining balance: Rs. %.2f%n",
                    calculateDifference());
        } else {
            System.out.println("Insufficient balance.");
            System.out.printf("Amount needed: Rs. %.2f%n",
                    calculateDifference());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter recharge amount: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            sc.close();
            return;
        }
        double recharge = sc.nextDouble();

        System.out.print("Enter available balance: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            sc.close();
            return;
        }
        double balance = sc.nextDouble();

        if (!Double.isFinite(recharge) || !Double.isFinite(balance)
                || recharge < 0 || balance < 0) {
            System.out.println("Enter valid, non-negative amounts.");
            sc.close();
            return;
        }

        MobileRechargeChecker checker =
                new MobileRechargeChecker(recharge, balance);
        checker.displayResult();

        sc.close();
    }
}
