import java.util.Scanner;

public class MonthlySavingsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly income: Rs. ");
        double income = sc.nextDouble();

        System.out.print("Enter monthly expenses: Rs. ");
        double expenses = sc.nextDouble();

        double savings = income - expenses;

        System.out.println("Monthly savings: Rs. " + savings);

        sc.close();
    }
}
