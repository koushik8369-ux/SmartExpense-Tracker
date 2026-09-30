import java.util.Scanner;

public class CreditCardPaymentChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter credit card bill amount: Rs. ");
        double bill = sc.nextDouble();

        System.out.print("Enter amount paid: Rs. ");
        double paid = sc.nextDouble();

        if (paid >= bill) {
            System.out.println("Credit card bill fully paid.");
            System.out.println("Extra payment: Rs. " + (paid - bill));
        } else {
            System.out.println("Credit card bill is not fully paid.");
            System.out.println("Remaining amount: Rs. " + (bill - paid));
        }

        sc.close();
    }
}
