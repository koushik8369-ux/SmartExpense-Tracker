import java.util.Scanner;

public class MonthlyBudgetPlanner {

    private String userName;
    private double income;

    public MonthlyBudgetPlanner(String userName, double income) {
        this.userName = userName;
        this.income = income;
    }

    public double calculateNeedsBudget() {
        return income * 0.50;
    }

    public double calculateWantsBudget() {
        return income * 0.30;
    }

    public double calculateSavingsBudget() {
        return income * 0.20;
    }

    public void displayBudgetPlan() {
        double needs = calculateNeedsBudget();
        double wants = calculateWantsBudget();
        double savings = calculateSavingsBudget();

        System.out.println();
        System.out.println("--------- MONTHLY BUDGET PLAN ---------");
        System.out.printf("User Name       : %s%n", userName);
        System.out.printf("Monthly Income  : Rs. %.2f%n", income);
        System.out.println("---------------------------------------");
        System.out.printf("Needs (50%%)     : Rs. %.2f%n", needs);
        System.out.printf("Wants (30%%)     : Rs. %.2f%n", wants);
        System.out.printf("Savings (20%%)   : Rs. %.2f%n", savings);
        System.out.println("---------------------------------------");
        System.out.println("          WEEKLY BUDGET GUIDE");
        System.out.printf("Weekly Needs    : Rs. %.2f%n", needs / 4);
        System.out.printf("Weekly Wants    : Rs. %.2f%n", wants / 4);
        System.out.printf("Weekly Savings  : Rs. %.2f%n", savings / 4);
        System.out.println("---------------------------------------");

        if (savings >= 10000) {
            System.out.println(
                    "Suggestion: Consider investing part of your savings.");
        } else if (savings >= 5000) {
            System.out.println(
                    "Suggestion: Maintain your monthly savings consistently.");
        } else {
            System.out.println(
                    "Suggestion: Review optional expenses where possible.");
        }

        System.out.println("=======================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     MONTHLY BUDGET PLANNER");
        System.out.println("================================");

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine().trim();

        if (userName.isEmpty()) {
            System.out.println("User name cannot be empty.");
            scanner.close();
            return;
        }

        System.out.print("Enter monthly income: Rs. ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid income amount.");
            scanner.close();
            return;
        }

        double income = scanner.nextDouble();

        if (!Double.isFinite(income) || income <= 0) {
            System.out.println(
                    "Monthly income must be a valid amount greater than zero.");
            scanner.close();
            return;
        }

        MonthlyBudgetPlanner planner =
                new MonthlyBudgetPlanner(userName, income);
        planner.displayBudgetPlan();

        scanner.close();
    }
}
