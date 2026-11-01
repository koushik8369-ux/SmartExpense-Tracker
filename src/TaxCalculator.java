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

       
        sc.close();
    }
}
