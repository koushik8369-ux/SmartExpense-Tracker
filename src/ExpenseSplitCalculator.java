import java.util.Scanner;

public class ExpenseSplitCalculator {
    private double totalExpense;
    private int people;

    public ExpenseSplitCalculator(double totalExpense, int people) {
        this.totalExpense = totalExpense;
        this.people = people;
    }

    public double calculateShare() {
        return totalExpense / people;
    }

    public void displayReport() {
        System.out.println("\n--- Expense Split Report ---");
        System.out.printf("Total Expense: Rs. %.2f%n", totalExpense);
        System.out.println("Number of People: " + people);
        System.out.printf("Each Person Pays: Rs. %.2f%n",
                calculateShare());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total expense: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid expense.");
            sc.close();
            return;
        }
        double expense = sc.nextDouble();

        System.out.print("Enter number of people: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid number of people.");
            sc.close();
            return;
        }
        int people = sc.nextInt();

        if (!Double.isFinite(expense) || expense < 0 || people <= 0) {
            System.out.println("Enter a valid expense and positive people count.");
            sc.close();
            return;
        }

        new ExpenseSplitCalculator(expense, people).displayReport();
        sc.close();
    }
}
