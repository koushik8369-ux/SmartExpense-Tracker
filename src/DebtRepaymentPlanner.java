import java.util.Scanner;

public class DebtRepaymentPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     DEBT REPAYMENT PLANNER");
        System.out.println("================================");

        System.out.print("Enter outstanding debt amount: Rs. ");
        double debt = scanner.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter monthly payment amount: Rs. ");
        double monthlyPayment = scanner.nextDouble();

        if (debt <= 0 || annualInterestRate < 0 || monthlyPayment <= 0) {
            System.out.println("Please enter valid financial details.");
            scanner.close();
            return;
        }

        double monthlyInterestRate = annualInterestRate / 12 / 100;
        double firstMonthInterest = debt * monthlyInterestRate;

        if (monthlyPayment <= firstMonthInterest) {
            System.out.println();
            System.out.println("Warning: The monthly payment is too low.");
            System.out.println("It does not cover the monthly interest.");
            scanner.close();
            return;
        }

        double originalDebt = debt;
        double totalInterest = 0;
        int months = 0;

        while (debt > 0 && months < 600) {
            double monthlyInterest = debt * monthlyInterestRate;
            totalInterest += monthlyInterest;
            debt += monthlyInterest;

            if (monthlyPayment >= debt) {
                debt = 0;
            } else {
                debt -= monthlyPayment;
            }

            months++;
        }

        int years = months / 12;
        int remainingMonths = months % 12;
        double totalPayment = originalDebt + totalInterest;

        System.out.println();
        System.out.println("--------- REPAYMENT SUMMARY ---------");
        System.out.printf("Original Debt       : Rs. %.2f%n", originalDebt);
        System.out.printf("Annual Interest     : %.2f%%%n", annualInterestRate);
        System.out.printf("Monthly Payment     : Rs. %.2f%n", monthlyPayment);
        System.out.printf("Total Interest      : Rs. %.2f%n", totalInterest);
        System.out.printf("Estimated Payment   : Rs. %.2f%n", totalPayment);
        System.out.printf("Repayment Duration  : %d year(s), %d month(s)%n",
                years, remainingMonths);
        System.out.println("-------------------------------------");

        if (months <= 12) {
            System.out.println("Status: The debt can be cleared within one year.");
        } else if (months <= 36) {
            System.out.println("Status: The repayment period is manageable.");
        } else {
            System.out.println("Suggestion: Increase the monthly payment if possible.");
        }

        System.out.println("=====================================");
        scanner.close();
    }
}