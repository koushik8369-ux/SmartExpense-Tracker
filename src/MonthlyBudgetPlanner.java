import java.util.Scanner;

public class MonthlyBudgetPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     MONTHLY BUDGET PLANNER");
        System.out.println("================================");

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter monthly income: Rs. ");
        double income = scanner.nextDouble();

        if (userName.trim().isEmpty()) {
            System.out.println("User name cannot be empty.");
            scanner.close();
            return;
        }

        if (income <= 0) {
            System.out.println("Monthly income must be greater than zero.");
            scanner.close();
            return;
        }

        double needsBudget = income * 0.50;
        double wantsBudget = income * 0.30;
        double savingsBudget = income * 0.20;

        double weeklyNeeds = needsBudget / 4;
        double weeklyWants = wantsBudget / 4;
        double weeklySavings = savingsBudget / 4;

        System.out.println();
        System.out.println("--------- MONTHLY BUDGET PLAN ---------");
        System.out.printf("User Name       : %s%n", userName);
        System.out.printf("Monthly Income  : Rs. %.2f%n", income);
        System.out.println("---------------------------------------");
        System.out.printf("Needs (50%%)     : Rs. %.2f%n", needsBudget);
        System.out.printf("Wants (30%%)     : Rs. %.2f%n", wantsBudget);
        System.out.printf("Savings (20%%)   : Rs. %.2f%n", savingsBudget);
        System.out.println("---------------------------------------");
        System.out.println("          WEEKLY BUDGET GUIDE");
        System.out.printf("Weekly Needs    : Rs. %.2f%n", weeklyNeeds);
        System.out.printf("Weekly Wants    : Rs. %.2f%n", weeklyWants);
        System.out.printf("Weekly Savings  : Rs. %.2f%n", weeklySavings);
        System.out.println("---------------------------------------");

        if (savingsBudget >= 10000) {
            System.out.println("Suggestion: Consider investing part of your savings.");
        } else if (savingsBudget >= 5000) {
            System.out.println("Suggestion: Maintain your monthly savings consistently.");
        } else {
            System.out.println("Suggestion: Reduce optional expenses when possible.");
        }

        System.out.println("=======================================");
        scanner.close();
    }
}