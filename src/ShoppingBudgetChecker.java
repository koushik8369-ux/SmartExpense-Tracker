import java.util.Scanner;

public class ShoppingBudgetChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your shopping budget: Rs. ");
        double budget = sc.nextDouble();

        System.out.print("Enter shopping amount: Rs. ");
        double amount = sc.nextDouble();

        if (amount <= budget) {
            System.out.println("Shopping is within your budget.");
            System.out.println("Remaining budget: Rs. " + (budget - amount));
        } else {
            System.out.println("Shopping exceeds your budget.");
            System.out.println("Extra amount needed: Rs. " + (amount - budget));
        }

        sc.close();
    }
}
