import java.util.Scanner;

public class BillSplitCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total bill amount (Rs.): ");
        double bill = sc.nextDouble();

        System.out.print("Enter number of people: ");
        int people = sc.nextInt();

        if (bill <= 0 || people <= 0) {
            System.out.println("Please enter a positive bill and number of people.");
        } else {
            double share = bill / people;
            System.out.printf("Each person should pay: Rs. %.2f%n", share);
        }

        sc.close();
    }
}
