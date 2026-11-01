import java.util.Scanner;

public class ExpenseLimitAlert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly expense limit: Rs. ");
        double limit = sc.nextDouble();

        System.out.print("Enter current expenses: Rs. ");
        double expense = sc.nextDouble();

        if (expense > limit) {
            System.out.println("Alert: Expense limit exceeded!");
            System.out.println("Extra amount: Rs. " + (expense - limit));
        } else {
            System.out.println("Expenses are within the limit.");
            System.out.println("Remaining limit: Rs. " + (limit - expense));
        }

        sc.close();
    }
}
