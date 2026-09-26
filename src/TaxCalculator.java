import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = sc.nextDouble();

        System.out.print("Enter tax percentage: ");
        double taxPercent = sc.nextDouble();

        double tax = income * taxPercent / 100;
        double afterTaxIncome = income - tax;

        System.out.println("\n--- Tax Summary ---");
        System.out.println("Income: Rs. " + income);
        System.out.println("Tax Amount: Rs. " + tax);
        System.out.println("Income After Tax: Rs. " + afterTaxIncome);

        sc.close();
    }
}