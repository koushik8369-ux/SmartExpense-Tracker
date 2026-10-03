import java.util.Scanner;

public class TravelExpenseChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter travel budget: Rs. ");
        double budget = sc.nextDouble();

        System.out.print("Enter travel expense: Rs. ");
        double expense = sc.nextDouble();

        if (expense <= budget) {
            System.out.println("Travel expense is within budget.");
            System.out.println("Remaining: Rs. " + (budget - expense));
        } else {
            System.out.println("Travel budget exceeded.");
            System.out.println("Extra amount: Rs. " + (expense - budget));
        }

        sc.close();
    }
}
