import java.util.Scanner;

public class SubscriptionExpenseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("  SUBSCRIPTION EXPENSE CALCULATOR");
        System.out.println("====================================");

        System.out.print("Enter monthly income: Rs. ");
        double income = scanner.nextDouble();

        System.out.print("Enter OTT subscription cost: Rs. ");
        double ott = scanner.nextDouble();

        System.out.print("Enter music subscription cost: Rs. ");
        double music = scanner.nextDouble();

        System.out.print("Enter cloud storage cost: Rs. ");
        double cloudStorage = scanner.nextDouble();

        System.out.print("Enter gym membership cost: Rs. ");
        double gym = scanner.nextDouble();

        System.out.print("Enter other subscription costs: Rs. ");
        double others = scanner.nextDouble();

        if (income <= 0 || ott < 0 || music < 0 ||
                cloudStorage < 0 || gym < 0 || others < 0) {
            System.out.println("Please enter valid income and subscription amounts.");
            scanner.close();
            return;
        }

        double monthlyTotal =
                ott + music + cloudStorage + gym + others;

        double annualTotal = monthlyTotal * 12;
        double incomePercentage = (monthlyTotal / income) * 100;

        String highestSubscription = "OTT";
        double highestCost = ott;

        if (music > highestCost) {
            highestCost = music;
            highestSubscription = "Music";
        }

        if (cloudStorage > highestCost) {
            highestCost = cloudStorage;
            highestSubscription = "Cloud Storage";
        }

        if (gym > highestCost) {
            highestCost = gym;
            highestSubscription = "Gym";
        }

        if (others > highestCost) {
            highestCost = others;
            highestSubscription = "Others";
        }

        System.out.println();
        System.out.println("-------- SUBSCRIPTION SUMMARY --------");
        System.out.printf("OTT Subscription     : Rs. %.2f%n", ott);
        System.out.printf("Music Subscription   : Rs. %.2f%n", music);
        System.out.printf("Cloud Storage        : Rs. %.2f%n", cloudStorage);
        System.out.printf("Gym Membership       : Rs. %.2f%n", gym);
        System.out.printf("Other Subscriptions  : Rs. %.2f%n", others);
        System.out.println("--------------------------------------");
        System.out.printf("Monthly Total        : Rs. %.2f%n", monthlyTotal);
        System.out.printf("Annual Total         : Rs. %.2f%n", annualTotal);
        System.out.printf("Income Used          : %.2f%%%n", incomePercentage);
        System.out.printf("Highest Subscription : %s (Rs. %.2f)%n",
                highestSubscription, highestCost);
        System.out.println("--------------------------------------");

        if (monthlyTotal == 0) {
            System.out.println("Status: No subscription expenses recorded.");
        } else if (incomePercentage > 10) {
            System.out.println("Alert: Subscription spending is high.");
            System.out.println("Suggestion: Cancel subscriptions you rarely use.");
        } else if (incomePercentage > 5) {
            System.out.println("Status: Subscription spending is moderate.");
        } else {
            System.out.println("Status: Subscription spending is under control.");
        }

        System.out.println("======================================");
        scanner.close();
    }
}