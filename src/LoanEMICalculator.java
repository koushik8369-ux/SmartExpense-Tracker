import java.util.Scanner;

public class LoanEMICalculator {

    private double loanAmount;
    private double annualRate;
    private int years;

    public LoanEMICalculator(double loanAmount, double annualRate, int years) {
        this.loanAmount = loanAmount;
        this.annualRate = annualRate;
        this.years = years;
    }

    public double calculateEMI() {
        double monthlyRate = annualRate / (12 * 100);
        int months = years * 12;

        if (monthlyRate == 0) {
            return loanAmount / months;
        }

        double factor = Math.pow(1 + monthlyRate, months);

        return loanAmount * monthlyRate * factor / (factor - 1);
    }

    public double calculateTotalPayment() {
        return calculateEMI() * years * 12;
    }

    public double calculateTotalInterest() {
        return calculateTotalPayment() - loanAmount;
    }

    public void displayReport() {
        System.out.println("\n===== LOAN EMI REPORT =====");
        System.out.printf("Loan Amount: Rs. %.2f%n", loanAmount);
        System.out.printf("Annual Interest Rate: %.2f%%%n", annualRate);
        System.out.println("Loan Duration: " + years + " years");
        System.out.printf("Monthly EMI: Rs. %.2f%n", calculateEMI());
        System.out.printf("Total Payment: Rs. %.2f%n",
                calculateTotalPayment());
        System.out.printf("Total Interest: Rs. %.2f%n",
                calculateTotalInterest());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter loan amount: Rs. ");
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

        System.out.print("Enter loan duration in years: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid duration.");
            sc.close();
            return;
        }
        int years = sc.nextInt();

        if (!Double.isFinite(amount) || !Double.isFinite(rate)
                || amount <= 0 || rate < 0 || rate > 100 || years <= 0
                || years > 100) {
            System.out.println("Please enter valid loan details.");
            sc.close();
            return;
        }

        LoanEMICalculator calculator =
                new LoanEMICalculator(amount, rate, years);

        calculator.displayReport();
        sc.close();
    }
}
