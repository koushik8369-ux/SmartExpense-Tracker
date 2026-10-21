import java.util.Scanner;

public class EmergencyExpenseChecker {
    private double emergencyFund;
    private double emergencyCost;

    public EmergencyExpenseChecker(double emergencyFund, double emergencyCost) {
        this.emergencyFund = emergencyFund;
        this.emergencyCost = emergencyCost;
    }

    public double calculateBalance() {
        return emergencyFund - emergencyCost;
    }

    public void displayReport() {
        double balance = calculateBalance();

        System.out.println("\n--- Emergency Expense Report ---");
        System.out.printf("Available Fund: Rs. %.2f%n", emergencyFund);
        System.out.printf("Emergency Cost: Rs. %.2f%n", emergencyCost);

        if (balance >= 0) {
            System.out.printf("Remaining Fund: Rs. %.2f%n", balance);
            System.out.println("Your emergency fund covers this expense.");
        } else {
            System.out.printf("Additional Money Needed: Rs. %.2f%n",
                    Math.abs(balance));
            System.out.println("Your emergency fund is insufficient.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter available emergency fund: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid fund amount.");
            sc.close();
            return;
        }
        double fund = sc.nextDouble();

        System.out.print("Enter emergency expense: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid expense.");
            sc.close();
            return;
        }
        double cost = sc.nextDouble();

        if (!Double.isFinite(fund) || !Double.isFinite(cost)
                || fund < 0 || cost < 0) {
            System.out.println("Enter valid non-negative amounts.");
            sc.close();
            return;
        }

        new EmergencyExpenseChecker(fund, cost).displayReport();
        sc.close();
    }
}
