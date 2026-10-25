import java.util.Scanner;

public class PocketMoneyTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your pocket money (Rs.): ");
        double pocketMoney = sc.nextDouble();

        System.out.print("Enter number of expenses: ");
        int count = sc.nextInt();

        if (pocketMoney < 0 || count < 0) {
            System.out.println("Invalid input. Enter non-negative values.");
            sc.close();
            return;
        }

        double totalSpent = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter expense " + i + " (Rs.): ");
            double expense = sc.nextDouble();

            if (expense < 0) {
                System.out.println("Expense cannot be negative. Try again.");
                i--;
                continue;
            }

            totalSpent += expense;
        }

        double balance = pocketMoney - totalSpent;

        System.out.printf("%nPocket Money: Rs. %.2f%n", pocketMoney);
        System.out.printf("Total Spent: Rs. %.2f%n", totalSpent);
        System.out.printf("Remaining Balance: Rs. %.2f%n", balance);

        if (balance < 0) {
            System.out.println("Warning: You spent more than your pocket money!");
        } else {
            System.out.println("Pocket money status: Within budget.");
        }

        sc.close();
    }
}
