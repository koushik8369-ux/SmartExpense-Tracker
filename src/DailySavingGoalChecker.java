import java.util.Scanner;

public class DailySavingGoalChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your daily saving goal: Rs. ");
        double goal = sc.nextDouble();

        System.out.print("Enter amount saved today: Rs. ");
        double saved = sc.nextDouble();

        if (saved >= goal) {
            System.out.println("Saving goal achieved!");
            System.out.println("Extra saved: Rs. " + (saved - goal));
        } else {
            System.out.println("Saving goal not achieved.");
            System.out.println("Amount needed: Rs. " + (goal - saved));
        }

        sc.close();
    }
}
