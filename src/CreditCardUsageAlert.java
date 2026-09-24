import java.util.Scanner;

public class CreditCardUsageAlert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("       CREDIT CARD USAGE ALERT");
        System.out.println("====================================");

        System.out.print("Enter cardholder name: ");
        String cardholderName = scanner.nextLine();

        System.out.print("Enter total credit limit: Rs. ");
        double creditLimit = scanner.nextDouble();

        System.out.print("Enter current outstanding amount: Rs. ");
        double currentOutstanding = scanner.nextDouble();

        System.out.print("Enter new purchase amount: Rs. ");
        double newPurchase = scanner.nextDouble();

        if (cardholderName.trim().isEmpty()) {
            System.out.println("Cardholder name cannot be empty.");
            scanner.close();
            return;
        }

        if (creditLimit <= 0 || currentOutstanding < 0 || newPurchase < 0) {
            System.out.println("Please enter valid credit-card details.");
            scanner.close();
            return;
        }

        if (currentOutstanding > creditLimit) {
            System.out.println("Current outstanding amount exceeds the credit limit.");
            scanner.close();
            return;
        }

        double availableBeforePurchase =
                creditLimit - currentOutstanding;

        if (newPurchase > availableBeforePurchase) {
            double exceededAmount =
                    newPurchase - availableBeforePurchase;

            System.out.println();
            System.out.println("---------- TRANSACTION DECLINED ----------");
            System.out.printf("Available Credit : Rs. %.2f%n",
                    availableBeforePurchase);
            System.out.printf("Purchase Amount  : Rs. %.2f%n",
                    newPurchase);
            System.out.printf("Limit Exceeded By: Rs. %.2f%n",
                    exceededAmount);
            System.out.println("Alert: Purchase exceeds the available credit limit.");
            System.out.println("==========================================");

            scanner.close();
            return;
        }

        double updatedOutstanding =
                currentOutstanding + newPurchase;

        double remainingCredit =
                creditLimit - updatedOutstanding;

        double usageBeforePurchase =
                (currentOutstanding / creditLimit) * 100;

        double usagePercentage =
                (updatedOutstanding / creditLimit) * 100;

        double usageIncrease =
                usagePercentage - usageBeforePurchase;

        double minimumPayment =
                updatedOutstanding * 0.05;

        System.out.println();
        System.out.println("----------- CREDIT SUMMARY -----------");
        System.out.printf("Cardholder           : %s%n", cardholderName);
        System.out.printf("Credit Limit         : Rs. %.2f%n", creditLimit);
        System.out.printf("Previous Outstanding : Rs. %.2f%n",
                currentOutstanding);
        System.out.printf("New Purchase         : Rs. %.2f%n",
                newPurchase);
        System.out.println("--------------------------------------");
        System.out.printf("Updated Outstanding  : Rs. %.2f%n",
                updatedOutstanding);
        System.out.printf("Remaining Credit     : Rs. %.2f%n",
                remainingCredit);
        System.out.printf("Usage Before Purchase: %.2f%%%n",
                usageBeforePurchase);
        System.out.printf("Credit Utilization   : %.2f%%%n",
                usagePercentage);
        System.out.printf("Usage Increase       : %.2f%%%n",
                usageIncrease);
        System.out.printf("Minimum Payment      : Rs. %.2f%n",
                minimumPayment);
        System.out.println("--------------------------------------");

        if (usagePercentage >= 90) {
            System.out.println("Alert: Critical credit usage!");
            System.out.println("Suggestion: Avoid additional purchases.");
        } else if (usagePercentage >= 70) {
            System.out.println("Alert: Credit-card usage is high.");
        } else if (usagePercentage >= 30) {
            System.out.println("Status: Credit usage is moderate.");
        } else {
            System.out.println("Status: Credit usage is under control.");
        }

        System.out.println("======================================");
        scanner.close();
    }
}