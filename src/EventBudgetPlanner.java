import java.util.Scanner;

public class EventBudgetPlanner {
    private double totalBudget;
    private double venueCost;
    private double foodCost;
    private double decorationCost;

    public EventBudgetPlanner(double totalBudget, double venueCost,
                              double foodCost, double decorationCost) {
        this.totalBudget = totalBudget;
        this.venueCost = venueCost;
        this.foodCost = foodCost;
        this.decorationCost = decorationCost;
    }

    public double calculateTotalExpense() {
        return venueCost + foodCost + decorationCost;
    }

    public double calculateRemainingBudget() {
        return totalBudget - calculateTotalExpense();
    }

    public void displayReport() {
        System.out.println("\n===== EVENT BUDGET REPORT =====");
        System.out.printf("Total Budget: Rs. %.2f%n", totalBudget);
        System.out.printf("Venue Cost: Rs. %.2f%n", venueCost);
        System.out.printf("Food Cost: Rs. %.2f%n", foodCost);
        System.out.printf("Decoration Cost: Rs. %.2f%n", decorationCost);
        System.out.printf("Total Expense: Rs. %.2f%n", calculateTotalExpense());

        if (calculateRemainingBudget() >= 0) {
            System.out.printf("Remaining Budget: Rs. %.2f%n",
                    calculateRemainingBudget());
            System.out.println("Event is within budget.");
        } else {
            System.out.printf("Budget Exceeded: Rs. %.2f%n",
                    Math.abs(calculateRemainingBudget()));
            System.out.println("Warning! Event expenses exceed the budget.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total event budget: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double budget = sc.nextDouble();

        System.out.print("Enter venue cost: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double venue = sc.nextDouble();

        System.out.print("Enter food cost: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double food = sc.nextDouble();

        System.out.print("Enter decoration cost: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double decoration = sc.nextDouble();

        if (!Double.isFinite(budget) || !Double.isFinite(venue)
                || !Double.isFinite(food) || !Double.isFinite(decoration)
                || budget <= 0 || venue < 0 || food < 0 || decoration < 0
                || venue > Double.MAX_VALUE - food
                || venue + food > Double.MAX_VALUE - decoration) {
            System.out.println("Please enter valid budget and expense amounts.");
            sc.close();
            return;
        }

        EventBudgetPlanner planner =
                new EventBudgetPlanner(budget, venue, food, decoration);
        planner.displayReport();
        sc.close();
    }
}
