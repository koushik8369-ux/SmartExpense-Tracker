import java.util.Scanner;

public class GroceryBudgetCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your grocery budget: ");
        double budget = sc.nextDouble();

        System.out.print("Enter your grocery spending: ");
        double spending = sc.nextDouble();

        double remaining = budget - spending;

        System.out.println("\n--- Grocery Budget Summary ---");
        System.out.println("Budget: Rs. " + budget);
        System.out.println("Spending: Rs. " + spending);

        if (remaining > 0) {
            System.out.println("Remaining Budget: Rs. " + remaining);
            System.out.println("Status: Within Budget");
        } else if (remaining == 0) {
            System.out.println("Remaining Budget: Rs. 0");
            System.out.println("Status: Budget Fully Used");
        } else {
            System.out.println("Exceeded Amount: Rs. " + (-remaining));
            System.out.println("Status: Budget Exceeded");
        }

        sc.close();
    }
}