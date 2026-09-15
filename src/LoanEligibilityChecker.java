import java.util.Scanner;

public class LoanEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      HOME LOAN ELIGIBILITY CHECKER");
        System.out.println("====================================");

        System.out.print("Enter applicant name: ");
        String applicantName = scanner.nextLine();

        System.out.print("Enter monthly income: Rs. ");
        double monthlyIncome = scanner.nextDouble();

        System.out.print("Enter existing monthly EMI: Rs. ");
        double existingEMI = scanner.nextDouble();

        System.out.print("Enter requested loan amount: Rs. ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter loan tenure in years: ");
        int tenureYears = scanner.nextInt();

        if (applicantName.trim().isEmpty()) {
            System.out.println("Applicant name cannot be empty.");
            scanner.close();
            return;
        }

        if (monthlyIncome <= 0 || existingEMI < 0 ||
                loanAmount <= 0 || annualInterestRate <= 0 ||
                tenureYears <= 0) {
            System.out.println("Please enter valid loan details.");
            scanner.close();
            return;
        }

        double monthlyRate = annualInterestRate / 12 / 100;
        int tenureMonths = tenureYears * 12;
        double rateFactor = Math.pow(1 + monthlyRate, tenureMonths);

        double proposedEMI = loanAmount
                * monthlyRate * rateFactor
                / (rateFactor - 1);

        double totalEMI = existingEMI + proposedEMI;
        double maximumAllowedEMI = monthlyIncome * 0.50;
        double debtToIncomeRatio =
                (totalEMI / monthlyIncome) * 100;

        double remainingIncome = monthlyIncome - totalEMI;
        boolean eligible = totalEMI <= maximumAllowedEMI;

        System.out.println();
        System.out.println("---------- LOAN ASSESSMENT ----------");
        System.out.printf("Applicant Name      : %s%n", applicantName);
        System.out.printf("Monthly Income      : Rs. %.2f%n", monthlyIncome);
        System.out.printf("Existing EMI        : Rs. %.2f%n", existingEMI);
        System.out.printf("Requested Loan      : Rs. %.2f%n", loanAmount);
        System.out.printf("Interest Rate       : %.2f%%%n",
                annualInterestRate);
        System.out.printf("Loan Tenure         : %d year(s)%n", tenureYears);
        System.out.println("-------------------------------------");
        System.out.printf("Estimated New EMI   : Rs. %.2f%n", proposedEMI);
        System.out.printf("Total Monthly EMI   : Rs. %.2f%n", totalEMI);
        System.out.printf("Maximum Allowed EMI : Rs. %.2f%n",
                maximumAllowedEMI);
        System.out.printf("Debt-to-Income Ratio: %.2f%%%n",
                debtToIncomeRatio);
        System.out.printf("Remaining Income    : Rs. %.2f%n",
                remainingIncome);
        System.out.println("-------------------------------------");

        if (eligible) {
            System.out.println("Result: ELIGIBLE FOR THE LOAN");

            if (debtToIncomeRatio <= 30) {
                System.out.println("Status: Strong repayment capacity.");
            } else {
                System.out.println("Status: Acceptable repayment capacity.");
            }
        } else {
            double excessEMI = totalEMI - maximumAllowedEMI;

            System.out.println("Result: NOT ELIGIBLE FOR THE LOAN");
            System.out.printf("EMI exceeds the safe limit by Rs. %.2f%n",
                    excessEMI);
            System.out.println("Suggestion: Reduce the loan amount or increase tenure.");
        }

        System.out.println("=====================================");
        scanner.close();
    }
}