import java.util.Scanner;

public class SavingsGoalCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your savings goal: ");
        double goal = sc.nextDouble();

        System.out.print("Enter your current savings: ");
        double currentSavings = sc.nextDouble();

        System.out.print("Enter number of months: ");
        int months = sc.nextInt();

        double remaining = goal - currentSavings;

        System.out.println("\n--- Savings Goal Summary ---");
        System.out.println("Savings Goal: Rs. " + goal);
        System.out.println("Current Savings: Rs. " + currentSavings);

        if (remaining <= 0) {
            System.out.println("Goal Status: Goal Already Reached!");
        } else if (months <= 0) {
            System.out.println("Invalid number of months.");
        } else {
            double monthlySaving = remaining / months;

            System.out.println("Remaining Amount: Rs. " + remaining);
            System.out.println("Required Monthly Saving: Rs. " + monthlySaving);
        }

        sc.close();
    }
}