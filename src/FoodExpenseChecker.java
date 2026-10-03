import java.util.Scanner;

public class FoodExpenseChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter food budget: Rs. ");
        double budget = sc.nextDouble();

        System.out.print("Enter food expense: Rs. ");
        double expense = sc.nextDouble();

        if (expense <= budget) {
            System.out.println("Food expense is within budget.");
            System.out.println("Remaining: Rs. " + (budget - expense));
        } else {
            System.out.println("Food budget exceeded.");
            System.out.println("Extra expense: Rs. " + (expense - budget));
        }

        sc.close();
    }
}
