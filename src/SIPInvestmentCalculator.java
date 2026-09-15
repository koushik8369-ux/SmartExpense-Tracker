import java.util.Scanner;

public class SIPInvestmentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      SIP INVESTMENT CALCULATOR");
        System.out.println("====================================");

        System.out.print("Enter monthly investment amount: Rs. ");
        double monthlyInvestment = scanner.nextDouble();

        System.out.print("Enter expected annual return rate (%): ");
        double annualReturnRate = scanner.nextDouble();

        System.out.print("Enter investment duration in years: ");
        int years = scanner.nextInt();

        if (monthlyInvestment <= 0 ||
                annualReturnRate < 0 ||
                years <= 0) {
            System.out.println("Please enter valid investment details.");
            scanner.close();
            return;
        }

        int totalMonths = years * 12;
        double totalInvested = monthlyInvestment * totalMonths;
        double monthlyRate = annualReturnRate / 12 / 100;

        double maturityAmount;

        if (monthlyRate == 0) {
            maturityAmount = totalInvested;
        } else {
            maturityAmount = monthlyInvestment
                    * ((Math.pow(1 + monthlyRate, totalMonths) - 1)
                    / monthlyRate)
                    * (1 + monthlyRate);
        }

        double estimatedReturns = maturityAmount - totalInvested;
        double growthPercentage =
                (estimatedReturns / totalInvested) * 100;

        System.out.println();
        System.out.println("---------- SIP SUMMARY ----------");
        System.out.printf("Monthly Investment : Rs. %.2f%n",
                monthlyInvestment);
        System.out.printf("Expected Return     : %.2f%%%n",
                annualReturnRate);
        System.out.printf("Duration            : %d year(s)%n", years);
        System.out.printf("Total Installments  : %d%n", totalMonths);
        System.out.println("---------------------------------");
        System.out.printf("Total Invested      : Rs. %.2f%n",
                totalInvested);
        System.out.printf("Estimated Returns   : Rs. %.2f%n",
                estimatedReturns);
        System.out.printf("Maturity Amount     : Rs. %.2f%n",
                maturityAmount);
        System.out.printf("Investment Growth   : %.2f%%%n",
                growthPercentage);
        System.out.println("---------------------------------");

        if (years >= 10) {
            System.out.println("Status: Long-term SIP with strong growth potential.");
        } else if (years >= 5) {
            System.out.println("Status: Good medium-term investment plan.");
        } else {
            System.out.println("Suggestion: A longer duration may improve growth.");
        }

        System.out.println("=================================");
        scanner.close();
    }
}