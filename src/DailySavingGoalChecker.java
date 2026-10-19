import java.util.Scanner;

public class DailySavingGoalChecker {

    private double goal;
    private double saved;

    public DailySavingGoalChecker(double goal, double saved) {
        this.goal = goal;
        this.saved = saved;
    }

    public boolean isGoalAchieved() {
        return saved >= goal;
    }

    public double getDifference() {
        return Math.abs(saved - goal);
    }

    public double calculateProgress() {
        return Math.min((saved / goal) * 100, 100);
    }

    public void displayResult() {
        System.out.println();
        System.out.println("===== DAILY SAVINGS REPORT =====");
        System.out.printf("Daily Saving Goal : Rs. %.2f%n", goal);
        System.out.printf("Amount Saved      : Rs. %.2f%n", saved);
        System.out.printf("Goal Progress     : %.2f%%%n",
                calculateProgress());

        if (isGoalAchieved()) {
            System.out.println("Status: Saving Goal Achieved!");
            System.out.printf("Extra Saved       : Rs. %.2f%n",
                    getDifference());
        } else {
            System.out.println("Status: Goal Not Yet Achieved");
            System.out.printf("Amount Still Needed: Rs. %.2f%n",
                    getDifference());
            System.out.println("Suggestion: Save a little more if possible.");
        }

        System.out.println("================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your daily saving goal: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            sc.close();
            return;
        }
        double goal = sc.nextDouble();

        System.out.print("Enter amount saved today: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            sc.close();
            return;
        }
        double saved = sc.nextDouble();

        if (!Double.isFinite(goal) || !Double.isFinite(saved)
                || goal <= 0 || saved < 0) {
            System.out.println("Goal must be positive and savings "
                    + "must be non-negative valid amounts.");
            sc.close();
            return;
        }

        DailySavingGoalChecker checker =
                new DailySavingGoalChecker(goal, saved);
        checker.displayResult();

        sc.close();
    }
}
