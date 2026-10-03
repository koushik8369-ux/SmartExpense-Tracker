import java.util.Scanner;

public class EntertainmentBudgetChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter entertainment budget: Rs. ");
        double budget = sc.nextDouble();

        System.out.print("Enter entertainment expense: Rs. ");
        double expense = sc.nextDouble();

        if (expense <= budget) {
            System.out.println("Expense is within budget.");
            System.out.println("Remaining budget: Rs. " + (budget - expense));
        } else {
            System.out.println("Entertainment budget exceeded.");
            System.out.println("Extra amount: Rs. " + (expense - budget));
        }

        sc.close();
    }
}
