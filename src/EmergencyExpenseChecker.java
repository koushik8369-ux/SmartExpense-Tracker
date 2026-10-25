import java.util.Scanner;

public class EmergencyExpenseChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your emergency fund (Rs.): ");
        double fund = sc.nextDouble();

        System.out.print("Enter the emergency expense (Rs.): ");
        double expense = sc.nextDouble();

        if (fund < 0 || expense < 0) {
            System.out.println("Invalid input. Amounts cannot be negative.");
        } else if (expense <= fund) {
            double remaining = fund - expense;
            System.out.println("Emergency expense is affordable.");
            System.out.printf("Remaining fund: Rs. %.2f%n", remaining);
        } else {
            double shortage = expense - fund;
            System.out.println("Warning: Emergency fund is insufficient.");
            System.out.printf("Additional amount needed: Rs. %.2f%n", shortage);
        }

        sc.close();
    }
}
