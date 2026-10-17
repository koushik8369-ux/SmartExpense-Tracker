import java.util.Scanner;

public class DebtRepaymentPlanner {

    private double debt;
    private double annualInterestRate;
    private double monthlyPayment;

    public DebtRepaymentPlanner(double debt, double annualInterestRate,
            double monthlyPayment) {
        this.debt = debt;
        this.annualInterestRate = annualInterestRate;
        this.monthlyPayment = monthlyPayment;
    }

    public void calculateRepayment() {
        double originalDebt = debt;
        double monthlyRate = annualInterestRate / 1200;
        double firstMonthInterest = debt * monthlyRate;

        System.out.println();
        if (monthlyPayment <= firstMonthInterest) {
            System.out.println("Monthly payment must exceed the first month's interest.");
            return;
        }

        double totalInterest = 0;
        int months = 0;

        while (debt > 0 && months < 600) {
            double interest = debt * monthlyRate;
            totalInterest += interest;
            debt += interest;

            if (monthlyPayment >= debt) {
                debt = 0;
            } else {
                debt -= monthlyPayment;
            }
            months++;
        }

        if (debt > 0) {
            System.out.println("Debt could not be cleared within 600 months.");
            return;
        }

        System.out.println("--------- REPAYMENT SUMMARY ---------");
        System.out.printf("Original Debt      : Rs. %.2f%n", originalDebt);
        System.out.printf("Annual Interest    : %.2f%%%n", annualInterestRate);
        System.out.printf("Monthly Payment    : Rs. %.2f%n", monthlyPayment);
        System.out.printf("Total Interest     : Rs. %.2f%n", totalInterest);
        System.out.printf("Total Payment      : Rs. %.2f%n",
                originalDebt + totalInterest);
        System.out.printf("Repayment Duration : %d year(s), %d month(s)%n",
                months / 12, months % 12);

        if (months <= 12) {
            System.out.println("Status: Debt cleared within one year.");
        } else if (months <= 36) {
            System.out.println("Status: Repayment period is manageable.");
        } else {
            System.out.println("Suggestion: Increase monthly payment if possible.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter outstanding debt amount: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Enter a valid number.");
            sc.close();
            return;
        }
        double debt = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        if (!sc.hasNextDouble()) {
            System.out.println("Enter a valid number.");
            sc.close();
            return;
        }
        double rate = sc.nextDouble();

        System.out.print("Enter monthly payment amount: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Enter a valid number.");
            sc.close();
            return;
        }
        double payment = sc.nextDouble();

        if (!Double.isFinite(debt) || !Double.isFinite(rate)
                || !Double.isFinite(payment)
                || debt <= 0 || rate < 0 || payment <= 0) {
            System.out.println("Enter valid financial details.");
            sc.close();
            return;
        }

        DebtRepaymentPlanner planner =
                new DebtRepaymentPlanner(debt, rate, payment);
        planner.calculateRepayment();
        sc.close();
    }
}
