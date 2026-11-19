import java.util.Scanner;

public class CreditCardPaymentChecker {

    private double billAmount;
    private double amountPaid;

    public CreditCardPaymentChecker(double billAmount, double amountPaid) {
        this.billAmount = billAmount;
        this.amountPaid = amountPaid;
    }

    public double calculateRemainingAmount() {
        return Math.max(0, billAmount - amountPaid);
    }

    public double calculateExtraPayment() {
        return Math.max(0, amountPaid - billAmount);
    }

    public double calculatePaymentPercentage() {
        if (billAmount == 0) {
            return 100;
        }
        return Math.min(100, (amountPaid / billAmount) * 100);
    }

    public void displaySummary() {
        System.out.println();
        System.out.println("===== CREDIT CARD PAYMENT SUMMARY =====");
        System.out.printf("Bill Amount       : Rs. %.2f%n", billAmount);
        System.out.printf("Amount Paid       : Rs. %.2f%n", amountPaid);
        System.out.printf("Payment Completed : %.2f%%%n",
                calculatePaymentPercentage());

        if (amountPaid >= billAmount) {
            System.out.println("Status: Bill Fully Paid");
            System.out.printf("Extra Payment     : Rs. %.2f%n",
                    calculateExtraPayment());
        } else {
            System.out.println("Status: Payment Pending");
            System.out.printf("Remaining Amount  : Rs. %.2f%n",
                    calculateRemainingAmount());
        }

        System.out.println("=======================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter credit card bill amount: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid bill amount.");
            sc.close();
            return;
        }
        double bill = sc.nextDouble();

        System.out.print("Enter amount paid: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid payment amount.");
            sc.close();
            return;
        }
        double paid = sc.nextDouble();

        if (!Double.isFinite(bill) || !Double.isFinite(paid)
                || bill < 0 || paid < 0) {
            System.out.println("Amounts must be valid and non-negative.");
            sc.close();
            return;
        }

        CreditCardPaymentChecker checker =
                new CreditCardPaymentChecker(bill, paid);
        checker.displaySummary();

        sc.close();
    }
}
