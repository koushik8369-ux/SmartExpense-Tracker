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

    public void displayResult() {
        if (isGoalAchieved()) {
            System.out.println("Saving goal achieved!");
            System.out.printf("Extra saved: Rs. %.2f%n", getDifference());
        } else {
            System.out.println("Saving goal not achieved.");
            System.out.printf("Amount needed: Rs. %.2f%n", getDifference());
        }
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

        if (goal < 0 || saved < 0) {
            System.out.println("Amounts cannot be negative.");
            sc.close();
            return;
        }

        DailySavingGoalChecker checker =
                new DailySavingGoalChecker(goal, saved);
        checker.displayResult();

        sc.close();
    }
}
