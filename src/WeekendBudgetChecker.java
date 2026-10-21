import java.util.Scanner;

public class WeekendBudgetChecker {
    private double budget;
    private double spent;

    public WeekendBudgetChecker(double budget, double spent) {
        this.budget = budget;
        this.spent = spent;
    }

    public void displayReport() {
        double remaining = budget - spent;
        double usage = budget > 0 ? (spent / budget) * 100 : 0;

        System.out.println("\n--- Weekend Budget Report ---");
        System.out.printf("Budget: Rs. %.2f%n", budget);
        System.out.printf("Spent: Rs. %.2f%n", spent);
        System.out.printf("Remaining: Rs. %.2f%n", remaining);
        System.out.printf("Budget Used: %.2f%%%n", usage);

        if (remaining < 0) {
            System.out.printf("Overspent by: Rs. %.2f%n",
                    Math.abs(remaining));
        } else {
            System.out.println("You are within your budget!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weekend budget: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid budget.");
            sc.close();
            return;
        }
        double budget = sc.nextDouble();

        System.out.print("Enter total weekend spending: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid spending amount.");
            sc.close();
            return;
        }
        double spent = sc.nextDouble();

        if (!Double.isFinite(budget) || !Double.isFinite(spent)
                || budget <= 0 || spent < 0) {
            System.out.println("Enter a positive budget and valid spending.");
            sc.close();
            return;
        }

        new WeekendBudgetChecker(budget, spent).displayReport();
        sc.close();
    }
}
