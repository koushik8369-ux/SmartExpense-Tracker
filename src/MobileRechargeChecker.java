import java.util.Scanner;

public class MobileRechargeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter recharge amount: Rs. ");
        double recharge = sc.nextDouble();

        System.out.print("Enter available balance: Rs. ");
        double balance = sc.nextDouble();

        if (balance >= recharge) {
            System.out.println("Recharge can be completed.");
            System.out.println("Remaining balance: Rs. " + (balance - recharge));
        } else {
            System.out.println("Insufficient balance.");
            System.out.println("Amount needed: Rs. " + (recharge - balance));
        }

        sc.close();
    }
}
