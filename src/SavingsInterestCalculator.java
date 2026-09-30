import java.util.Scanner;

public class SavingsInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter savings amount: Rs. ");
        double amount = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = sc.nextDouble();

        double interest = amount * rate / 100;
        double total = amount + interest;

        System.out.println("Interest earned: Rs. " + interest);
        System.out.println("Total amount: Rs. " + total);

        sc.close();
    }
}
