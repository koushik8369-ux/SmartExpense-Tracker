import java.util.Scanner;

public class SavingsGoalPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      SAVINGS GOAL PLANNER");
        System.out.println("================================");

        System.out.print("Enter savings goal: Rs. ");
        double goal = scanner.nextDouble();

        System.out.print("Enter current savings: Rs. ");
        double currentSavings = scanner.nextDouble();

        System.out.print("Enter monthly saving amount: Rs. ");
        double monthlySaving = scanner.nextDouble();

        if (goal <= 0 || currentSavings < 0 || monthlySaving <= 0) {
            System.out.println("Please enter valid financial details.");
            scanner.close();
            return;
        }

        if (currentSavings >= goal) {
            System.out.println("Congratulations! Your savings goal is already achieved.");
        } else {
            double remainingAmount = goal - currentSavings;
            int monthsRequired =
                    (int) Math.ceil(remainingAmount / monthlySaving);
            double progress = (currentSavings / goal) * 100;

            System.out.println();
            System.out.println("---------- SAVINGS SUMMARY ----------");
            System.out.printf("Savings Goal     : Rs. %.2f%n", goal);
            System.out.printf("Current Savings  : Rs. %.2f%n", currentSavings);
            System.out.printf("Remaining Amount : Rs. %.2f%n", remainingAmount);
            System.out.printf("Monthly Saving   : Rs. %.2f%n", monthlySaving);
            System.out.printf("Goal Progress    : %.2f%%%n", progress);
            System.out.printf("Months Required  : %d month(s)%n", monthsRequired);
            System.out.println("-------------------------------------");

            if (monthsRequired <= 6) {
                System.out.println("Status: Your goal is within close reach!");
            } else if (monthsRequired <= 12) {
                System.out.println("Status: Your goal can be achieved within one year.");
            } else {
                System.out.println("Status: Continue saving consistently.");
            }
        }

        System.out.println("================================");
        scanner.close();
    }
}