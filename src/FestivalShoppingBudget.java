import java.util.Scanner;

public class FestivalShoppingBudget {

    private double budget;
    private double clothesExpense;
    private double foodExpense;
    private double decorationExpense;

    public FestivalShoppingBudget(double budget, double clothesExpense,
                                  double foodExpense, double decorationExpense) {
        this.budget = budget;
        this.clothesExpense = clothesExpense;
        this.foodExpense = foodExpense;
        this.decorationExpense = decorationExpense;
    }

    public double calculateTotalExpense() {
        return clothesExpense + foodExpense + decorationExpense;
    }

    public double calculateRemainingBudget() {
        return budget - calculateTotalExpense();
    }

    public void displayReport() {
        System.out.println("\n===== FESTIVAL SHOPPING REPORT =====");
        System.out.printf("Shopping Budget: Rs. %.2f%n", budget);
        System.out.printf("Clothes: Rs. %.2f%n", clothesExpense);
        System.out.printf("Food: Rs. %.2f%n", foodExpense);
        System.out.printf("Decoration: Rs. %.2f%n", decorationExpense);
        System.out.printf("Total Expense: Rs. %.2f%n",
                calculateTotalExpense());

        if (calculateRemainingBudget() >= 0) {
            System.out.printf("Remaining Budget: Rs. %.2f%n",
                    calculateRemainingBudget());
            System.out.println("Great! You are within your budget.");
        } else {
            System.out.printf("Budget Exceeded: Rs. %.2f%n",
                    Math.abs(calculateRemainingBudget()));
            System.out.println("You have exceeded your budget.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter festival budget: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double budget = sc.nextDouble();

        System.out.print("Enter clothes expense: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double clothes = sc.nextDouble();

        System.out.print("Enter food expense: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double food = sc.nextDouble();

        System.out.print("Enter decoration expense: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double decoration = sc.nextDouble();

        if (!Double.isFinite(budget) || !Double.isFinite(clothes)
                || !Double.isFinite(food) || !Double.isFinite(decoration)
                || budget <= 0 || clothes < 0 || food < 0 || decoration < 0
                || clothes > Double.MAX_VALUE - food
                || clothes + food > Double.MAX_VALUE - decoration) {
            System.out.println("Please enter valid expense details.");
            sc.close();
            return;
        }

        FestivalShoppingBudget planner =
                new FestivalShoppingBudget(budget, clothes, food, decoration);

        planner.displayReport();
        sc.close();
    }
}
