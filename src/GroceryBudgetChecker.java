import java.util.Scanner;

public class GroceryBudgetChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grocery budget: Rs. ");
        double budget = sc.nextDouble();

        System.out.print("Enter grocery expense: Rs. ");
        double expense = sc.nextDouble();

        if (expense <= budget) {
            System.out.println("Grocery expense is within budget.");
            System.out.println("Remaining: Rs. " + (budget - expense));
        } else {
            System.out.println("Grocery budget exceeded.");
            System.out.println("Extra amount: Rs. " + (expense - budget));
        }

        sc.close();
    }
}
