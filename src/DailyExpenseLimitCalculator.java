import java.util.Scanner;

public class DailyExpenseLimitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("   DAILY EXPENSE LIMIT CALCULATOR");
        System.out.println("====================================");

        System.out.print("Enter monthly income: Rs. ");
        double income = scanner.nextDouble();

        System.out.print("Enter fixed monthly expenses: Rs. ");
        double fixedExpenses = scanner.nextDouble();

        System.out.print("Enter monthly savings target: Rs. ");
        double savingsTarget = scanner.nextDouble();

        System.out.print("Enter number of days in the month: ");
        int daysInMonth = scanner.nextInt();

        if (income <= 0 || fixedExpenses < 0 || savingsTarget < 0) {
            System.out.println("Please enter valid financial amounts.");
            scanner.close();
            return;
        }

        if (daysInMonth < 28 || daysInMonth > 31) {
            System.out.println("Number of days must be between 28 and 31.");
            scanner.close();
            return;
        }

        double committedAmount = fixedExpenses + savingsTarget;

        if (committedAmount > income) {
            double shortage = committedAmount - income;

            System.out.println();
            System.out.println("----------- BUDGET ALERT -----------");
            System.out.printf("Monthly Income    : Rs. %.2f%n", income);
            System.out.printf("Committed Amount  : Rs. %.2f%n", committedAmount);
            System.out.printf("Budget Shortage   : Rs. %.2f%n", shortage);
            System.out.println("Status: Your current plan exceeds your income.");
            System.out.println("Suggestion: Reduce expenses or adjust the savings target.");
            System.out.println("====================================");

            scanner.close();
            return;
        }

        double flexibleBudget = income - committedAmount;
        double dailyLimit = flexibleBudget / daysInMonth;
        double weeklyLimit = dailyLimit * 7;
        double savingsPercentage = (savingsTarget / income) * 100;`r`ndouble yearlySavingsProjection = savingsTarget * 12;

        System.out.println();
        System.out.println("--------- DAILY BUDGET REPORT ---------");
        System.out.printf("Monthly Income      : Rs. %.2f%n", income);
        System.out.printf("Fixed Expenses      : Rs. %.2f%n", fixedExpenses);
        System.out.printf("Savings Target      : Rs. %.2f%n", savingsTarget);
        System.out.printf("Savings Percentage  : %.2f%%%n", savingsPercentage);`r`n        System.out.printf("Yearly Savings Goal : Rs. %.2f%n", yearlySavingsProjection);
        System.out.println("---------------------------------------");
        System.out.printf("Flexible Budget     : Rs. %.2f%n", flexibleBudget);
        System.out.printf("Weekly Limit        : Rs. %.2f%n", weeklyLimit);
        System.out.printf("Recommended Daily Limit: Rs. %.2f%n", dailyLimit);
        System.out.println("---------------------------------------");

        if (dailyLimit >= 1000) {
            System.out.println("Status: Comfortable daily spending limit.");
        } else if (dailyLimit >= 500) {
            System.out.println("Status: Maintain controlled daily spending.");
        } else {
            System.out.println("Alert: Your daily spending limit is low.");
            System.out.println("Suggestion: Avoid unnecessary purchases.");
        }

        System.out.println("=======================================");
        scanner.close();
    }
}
