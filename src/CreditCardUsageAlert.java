import java.util.Scanner;

public class CreditCardUsageAlert {

    private String cardholderName;
    private double creditLimit;
    private double currentOutstanding;
    private double newPurchase;

    public CreditCardUsageAlert(String cardholderName, double creditLimit,
                                double currentOutstanding, double newPurchase) {
        this.cardholderName = cardholderName;
        this.creditLimit = creditLimit;
        this.currentOutstanding = currentOutstanding;
        this.newPurchase = newPurchase;
    }

    public double calculateAvailableCredit() {
        return creditLimit - currentOutstanding;
    }

    public double calculateUpdatedOutstanding() {
        return currentOutstanding + newPurchase;
    }

    public double calculateUtilization(double outstanding) {
        return (outstanding / creditLimit) * 100;
    }

    public void displayReport() {
        double availableCredit = calculateAvailableCredit();

        System.out.println();
        System.out.println("====================================");

        if (newPurchase > availableCredit) {
            System.out.println("       TRANSACTION DECLINED");
            System.out.printf("Cardholder       : %s%n", cardholderName);
            System.out.printf("Available Credit  : Rs. %.2f%n", availableCredit);
            System.out.printf("Purchase Amount   : Rs. %.2f%n", newPurchase);
            System.out.printf("Exceeded By       : Rs. %.2f%n",
                    newPurchase - availableCredit);
            System.out.println("Alert: Insufficient available credit.");
            System.out.println("====================================");
            return;
        }

        double updatedOutstanding = calculateUpdatedOutstanding();
        double remainingCredit = creditLimit - updatedOutstanding;
        double usageBefore = calculateUtilization(currentOutstanding);
        double usageAfter = calculateUtilization(updatedOutstanding);
        double minimumPaymentEstimate = updatedOutstanding * 0.05;

        System.out.println("       CREDIT CARD SUMMARY");
        System.out.println("====================================");
        System.out.printf("Cardholder           : %s%n", cardholderName);
        System.out.printf("Credit Limit         : Rs. %.2f%n", creditLimit);
        System.out.printf("Previous Outstanding : Rs. %.2f%n",
                currentOutstanding);
        System.out.printf("New Purchase         : Rs. %.2f%n", newPurchase);
        System.out.printf("Updated Outstanding  : Rs. %.2f%n",
                updatedOutstanding);
        System.out.printf("Remaining Credit     : Rs. %.2f%n",
                remainingCredit);
        System.out.printf("Usage Before         : %.2f%%%n", usageBefore);
        System.out.printf("Credit Utilization   : %.2f%%%n", usageAfter);
        System.out.printf("Usage Increase       : %.2f%%%n",
                usageAfter - usageBefore);
        System.out.printf("5%% Payment Estimate  : Rs. %.2f%n",
                minimumPaymentEstimate);
        System.out.println("------------------------------------");

        if (usageAfter >= 90) {
            System.out.println("Alert: Critical credit usage!");
            System.out.println("Suggestion: Avoid additional purchases.");
        } else if (usageAfter >= 70) {
            System.out.println("Alert: Credit-card usage is high.");
        } else if (usageAfter >= 30) {
            System.out.println("Status: Credit usage is moderate.");
        } else {
            System.out.println("Status: Credit usage is under control.");
        }

        System.out.println("Note: Payment estimate is illustrative, not a bank quote.");
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("       CREDIT CARD USAGE ALERT");
        System.out.println("====================================");

        System.out.print("Enter cardholder name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Cardholder name cannot be empty.");
            scanner.close();
            return;
        }

        System.out.print("Enter total credit limit: Rs. ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Enter a valid credit limit.");
            scanner.close();
            return;
        }
        double limit = scanner.nextDouble();

        System.out.print("Enter current outstanding amount: Rs. ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Enter a valid outstanding amount.");
            scanner.close();
            return;
        }
        double outstanding = scanner.nextDouble();

        System.out.print("Enter new purchase amount: Rs. ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Enter a valid purchase amount.");
            scanner.close();
            return;
        }
        double purchase = scanner.nextDouble();

        if (!Double.isFinite(limit) || !Double.isFinite(outstanding)
                || !Double.isFinite(purchase)
                || limit <= 0 || outstanding < 0 || purchase < 0) {
            System.out.println("Amounts must be valid and non-negative, "
                    + "and the credit limit must be positive.");
            scanner.close();
            return;
        }

        if (outstanding > limit) {
            System.out.println("Current outstanding exceeds the credit limit.");
            scanner.close();
            return;
        }

        CreditCardUsageAlert alert =
                new CreditCardUsageAlert(name, limit, outstanding, purchase);
        alert.displayReport();

        scanner.close();
    }
}
