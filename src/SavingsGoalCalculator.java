import java.util.Scanner;

public class SavingsGoalCalculator {

    private double goal;
    private double currentSavings;
    private int months;

    public SavingsGoalCalculator(double goal, double currentSavings, int months) {
        this.goal = goal;
        this.currentSavings = currentSavings;
        this.months = months;
    }

    public double calculateRemaining() {
        return Math.max(0, goal - currentSavings);
    }

    public double calculateProgress() {
        return Math.min(100, (currentSavings / goal) * 100);
    }

    public double calculateMonthlySaving() {
        return calculateRemaining() / months;
    }

    public void displaySummary() {
        double remaining = calculateRemaining();

        System.out.println();
        System.out.println("--- Savings Goal Summary ---");
        System.out.printf("Savings Goal       : Rs. %.2f%n", goal);
        System.out.printf("Current Savings    : Rs. %.2f%n", currentSavings);
        System.out.printf("Goal Progress      : %.2f%%%n", calculateProgress());

        if (remaining == 0) {
            System.out.println("Goal Status: Goal Already Reached!");
        } else {
            System.out.printf("Remaining Amount   : Rs. %.2f%n", remaining);
            System.out.printf("Required Monthly Saving: Rs. %.2f%n",
                    calculateMonthlySaving());
            System.out.println("Goal Status: Keep saving regularly!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your savings goal: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid amount.");
            sc.close();
            return;
        }
        double goal = sc.nextDouble();

        System.out.print("Enter your current savings: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid amount.");
            sc.close();
            return;
        }
        double currentSavings = sc.nextDouble();

        System.out.print("Enter number of months: ");
        if (!sc.hasNextInt()) {
            System.out.println("Please enter a whole number of months.");
            sc.close();
            return;
        }
        int months = sc.nextInt();

        if (!Double.isFinite(goal) || !Double.isFinite(currentSavings)
                || goal <= 0 || currentSavings < 0 || months <= 0) {
            System.out.println("Invalid input. Goal must be positive, "
                    + "savings cannot be negative, and months must be positive.");
            sc.close();
            return;
        }

        SavingsGoalCalculator calculator =
                new SavingsGoalCalculator(goal, currentSavings, months);
        calculator.displaySummary();

        sc.close();
    }
}
