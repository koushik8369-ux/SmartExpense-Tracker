import java.util.Scanner;

public class NoSpendChallengeTracker {

    private int challengeDays;
    private int completedDays;
    private double dailySavingTarget;

    public NoSpendChallengeTracker(int challengeDays, int completedDays,
                                   double dailySavingTarget) {
        this.challengeDays = challengeDays;
        this.completedDays = completedDays;
        this.dailySavingTarget = dailySavingTarget;
    }

    public double calculateTotalSavings() {
        return completedDays * dailySavingTarget;
    }

    public double calculateRemainingSavings() {
        return (challengeDays - completedDays) * dailySavingTarget;
    }

    public double calculateProgress() {
        return (completedDays * 100.0) / challengeDays;
    }

    public void displayReport() {
        System.out.println("\n===== NO SPEND CHALLENGE REPORT =====");
        System.out.println("Challenge Duration: " + challengeDays + " days");
        System.out.println("Completed Days: " + completedDays);
        System.out.printf("Daily Saving Target: Rs. %.2f%n", dailySavingTarget);
        System.out.printf("Total Savings: Rs. %.2f%n", calculateTotalSavings());
        System.out.printf("Expected Remaining Savings: Rs. %.2f%n",
                calculateRemainingSavings());
        System.out.printf("Challenge Progress: %.2f%%%n", calculateProgress());

        if (completedDays == challengeDays) {
            System.out.println("Congratulations! Challenge completed!");
        } else {
            System.out.println("Keep going! You can complete your challenge.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter challenge duration in days: ");
        if (!sc.hasNextInt()) {
            System.out.println("Enter a valid number.");
            sc.close();
            return;
        }
        int days = sc.nextInt();

        System.out.print("Enter completed days: ");
        if (!sc.hasNextInt()) {
            System.out.println("Enter a valid number.");
            sc.close();
            return;
        }
        int completed = sc.nextInt();

        System.out.print("Enter daily saving target (Rs.): ");
        if (!sc.hasNextDouble()) {
            System.out.println("Enter a valid amount.");
            sc.close();
            return;
        }
        double target = sc.nextDouble();

        if (days <= 0 || completed < 0 || completed > days
                || !Double.isFinite(target) || target < 0) {
            System.out.println("Please enter valid challenge details.");
            sc.close();
            return;
        }

        NoSpendChallengeTracker tracker =
                new NoSpendChallengeTracker(days, completed, target);

        tracker.displayReport();
        sc.close();
    }
}

