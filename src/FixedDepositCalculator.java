import java.util.Scanner;

public class FixedDepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println(" FIXED DEPOSIT MATURITY CALCULATOR");
        System.out.println("====================================");

        System.out.print("Enter deposit amount: Rs. ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter deposit duration in years: ");
        int years = scanner.nextInt();

        System.out.println();
        System.out.println("Select compounding frequency:");
        System.out.println("1. Yearly");
        System.out.println("2. Half-yearly");
        System.out.println("3. Quarterly");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (principal <= 0 || annualRate <= 0 || years <= 0) {
            System.out.println("Please enter valid deposit details.");
            scanner.close();
            return;
        }

        int compoundsPerYear;
        String frequency;

        switch (choice) {
            case 1:
                compoundsPerYear = 1;
                frequency = "Yearly";
                break;
            case 2:
                compoundsPerYear = 2;
                frequency = "Half-yearly";
                break;
            case 3:
                compoundsPerYear = 4;
                frequency = "Quarterly";
                break;
            default:
                System.out.println("Invalid compounding choice.");
                scanner.close();
                return;
        }

        double rate = annualRate / 100;
        double maturityAmount = principal * Math.pow(
                1 + rate / compoundsPerYear,
                compoundsPerYear * years
        );

        double interestEarned = maturityAmount - principal;
        double growthPercentage = (interestEarned / principal) * 100;

        System.out.println();
        System.out.println("---------- DEPOSIT SUMMARY ----------");
        System.out.printf("Principal Amount  : Rs. %.2f%n", principal);
        System.out.printf("Annual Interest   : %.2f%%%n", annualRate);
        System.out.printf("Duration          : %d year(s)%n", years);
        System.out.printf("Compounding       : %s%n", frequency);
        System.out.println("-------------------------------------");
        System.out.printf("Interest Earned   : Rs. %.2f%n", interestEarned);
        System.out.printf("Maturity Amount   : Rs. %.2f%n", maturityAmount);
        System.out.printf("Investment Growth : %.2f%%%n", growthPercentage);
        System.out.println("-------------------------------------");

        if (years >= 5) {
            System.out.println("Status: Long-term deposit with stronger growth.");
        } else if (years >= 3) {
            System.out.println("Status: Medium-term fixed deposit.");
        } else {
            System.out.println("Status: Short-term fixed deposit.");
        }

        System.out.println("=====================================");
        scanner.close();
    }
}