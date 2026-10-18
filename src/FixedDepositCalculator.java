import java.util.Scanner;

public class FixedDepositCalculator {

    private double principal;
    private double annualRate;
    private int years;
    private int compoundsPerYear;
    private String frequency;

    public FixedDepositCalculator(double principal, double annualRate,
                                  int years, int compoundsPerYear,
                                  String frequency) {
        this.principal = principal;
        this.annualRate = annualRate;
        this.years = years;
        this.compoundsPerYear = compoundsPerYear;
        this.frequency = frequency;
    }

    public double calculateMaturityAmount() {
        double rate = annualRate / 100.0;
        return principal * Math.pow(
                1 + rate / compoundsPerYear,
                (double) compoundsPerYear * years
        );
    }

    public void displaySummary() {
        double maturityAmount = calculateMaturityAmount();
        double interestEarned = maturityAmount - principal;
        double growthPercentage = (interestEarned / principal) * 100;
        double effectiveAnnualGrowth =
                (Math.pow(maturityAmount / principal, 1.0 / years) - 1) * 100;

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
        System.out.printf("Effective Annual Growth: %.2f%%%n",
                effectiveAnnualGrowth);
        System.out.println("-------------------------------------");

        if (years >= 5) {
            System.out.println("Status: Long-term deposit with stronger growth.");
        } else if (years >= 3) {
            System.out.println("Status: Medium-term fixed deposit.");
        } else {
            System.out.println("Status: Short-term fixed deposit.");
        }

        System.out.println("Note: This is an estimate before taxes or fees.");
        System.out.println("=====================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println(" FIXED DEPOSIT MATURITY CALCULATOR");
        System.out.println("====================================");

        System.out.print("Enter deposit amount: Rs. ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid deposit amount.");
            scanner.close();
            return;
        }
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid interest rate.");
            scanner.close();
            return;
        }
        double annualRate = scanner.nextDouble();

        System.out.print("Enter deposit duration in years: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a whole number of years.");
            scanner.close();
            return;
        }
        int years = scanner.nextInt();

        if (!Double.isFinite(principal) || !Double.isFinite(annualRate)
                || principal <= 0 || annualRate < 0 || years <= 0
                || annualRate > 1000 || years > 100) {
            System.out.println("Invalid details. Amount must be positive, "
                    + "rate must be between 0 and 1000%, "
                    + "and duration must be 1 to 100 years.");
            scanner.close();
            return;
        }

        System.out.println();
        System.out.println("Select compounding frequency:");
        System.out.println("1. Yearly");
        System.out.println("2. Half-yearly");
        System.out.println("3. Quarterly");
        System.out.print("Enter your choice: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid choice.");
            scanner.close();
            return;
        }

        int choice = scanner.nextInt();
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

        FixedDepositCalculator calculator =
                new FixedDepositCalculator(principal, annualRate, years,
                        compoundsPerYear, frequency);

        calculator.displaySummary();
        scanner.close();
    }
}
