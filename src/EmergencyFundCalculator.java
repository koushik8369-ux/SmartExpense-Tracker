import java.util.Scanner;

public class EmergencyFundCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("   EMERGENCY FUND CALCULATOR");
        System.out.println("================================");

        System.out.print("Enter monthly essential expenses: Rs. ");
        double monthlyExpenses = scanner.nextDouble();

        System.out.print("Enter current emergency savings: Rs. ");
        double currentFund = scanner.nextDouble();

        System.out.print("Enter desired coverage in months (3 to 12): ");
        int coverageMonths = scanner.nextInt();

        if (monthlyExpenses <= 0 || currentFund < 0) {
            System.out.println("Please enter valid financial amounts.");
            scanner.close();
            return;
        }

        if (coverageMonths < 3 || coverageMonths > 12) {
            System.out.println("Coverage period must be between 3 and 12 months.");
            scanner.close();
            return;
        }

        double requiredFund = monthlyExpenses * coverageMonths;
        double remainingAmount = requiredFund - currentFund;
        double progress = (currentFund / requiredFund) * 100;

        if (progress > 100) {
            progress = 100;
        }

        System.out.println();
        System.out.println("------- EMERGENCY FUND REPORT -------");
        System.out.printf("Monthly Expenses  : Rs. %.2f%n", monthlyExpenses);
        System.out.printf("Coverage Period   : %d month(s)%n", coverageMonths);
        System.out.printf("Required Fund     : Rs. %.2f%n", requiredFund);
        System.out.printf("Current Fund      : Rs. %.2f%n", currentFund);
        System.out.printf("Fund Progress     : %.2f%%%n", progress);

        if (remainingAmount <= 0) {
            System.out.println("Remaining Amount  : Rs. 0.00");
            System.out.println("Status: Emergency fund target achieved!");
        } else {
            System.out.printf("Remaining Amount  : Rs. %.2f%n", remainingAmount);

            if (progress >= 75) {
                System.out.println("Status: You are close to your target.");
            } else if (progress >= 40) {
                System.out.println("Status: Your emergency fund is growing.");
            } else {
                System.out.println("Status: Prioritize building your emergency fund.");
            }
        }

        System.out.println("=====================================");
        scanner.close();
    }
}