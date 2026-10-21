import java.util.Scanner;

public class MonthlyBillReminder {
    private String billName;
    private double billAmount;
    private int daysLeft;

    public MonthlyBillReminder(String billName, double billAmount,
                               int daysLeft) {
        this.billName = billName;
        this.billAmount = billAmount;
        this.daysLeft = daysLeft;
    }

    public void displayReminder() {
        System.out.println("\n--- Monthly Bill Reminder ---");
        System.out.println("Bill: " + billName);
        System.out.printf("Amount Due: Rs. %.2f%n", billAmount);

        if (daysLeft == 0) {
            System.out.println("Reminder: The bill is due today!");
        } else if (daysLeft <= 3) {
            System.out.println("Reminder: The bill is due soon!");
            System.out.println("Days remaining: " + daysLeft);
        } else {
            System.out.println("Days remaining: " + daysLeft);
            System.out.println("You have time to prepare for payment.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bill name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter bill amount: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double amount = sc.nextDouble();

        System.out.print("Enter days until due date: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid number of days.");
            sc.close();
            return;
        }
        int days = sc.nextInt();

        if (name.isEmpty() || !Double.isFinite(amount)
                || amount < 0 || days < 0) {
            System.out.println("Please enter valid bill details.");
            sc.close();
            return;
        }

        new MonthlyBillReminder(name, amount, days).displayReminder();
        sc.close();
    }
}
