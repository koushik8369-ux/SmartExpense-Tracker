import java.util.Scanner;

public class BankDepositInterestCalculator {

    private double depositAmount;
    private double annualRate;
    private int years;

    public BankDepositInterestCalculator(double depositAmount,
                                         double annualRate, int years) {
        this.depositAmount = depositAmount;
        this.annualRate = annualRate;
        this.years = years;
    }

    public double calculateInterest() {
        return depositAmount * annualRate * years / 100;
    }

    public double calculateMaturityAmount() {
        return depositAmount + calculateInterest();
    }

    public void displayReport() {
        System.out.println("\n===== BANK DEPOSIT REPORT =====");
        System.out.printf("Deposit Amount: Rs. %.2f%n", depositAmount);
        System.out.printf("Annual Interest Rate: %.2f%%%n", annualRate);
        System.out.println("Duration: " + years + " years");
        System.out.printf("Total Interest: Rs. %.2f%n", calculateInterest());
        System.out.printf("Maturity Amount: Rs. %.2f%n",
                calculateMaturityAmount());
        System.out.println("Calculation uses simple interest.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter deposit amount: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double amount = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid rate.");
            sc.close();
            return;
        }
        double rate = sc.nextDouble();

        System.out.print("Enter duration in years: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid duration.");
            sc.close();
            return;
        }
        int years = sc.nextInt();

        if (!Double.isFinite(amount) || !Double.isFinite(rate)
                || amount <= 0 || rate < 0 || rate > 100
                || years <= 0 || years > 100
                || amount > Double.MAX_VALUE / (rate == 0 ? 1 : rate)
                || amount * rate / 100 > Double.MAX_VALUE / years) {
            System.out.println("Please enter valid deposit details.");
            sc.close();
            return;
        }

        BankDepositInterestCalculator calculator =
                new BankDepositInterestCalculator(amount, rate, years);

        calculator.displayReport();
        sc.close();
    }
}
