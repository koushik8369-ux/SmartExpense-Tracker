import java.util.Scanner;

public class SubscriptionExpenseCalculator {

    private double income;
    private double ott;
    private double music;
    private double cloudStorage;
    private double gym;
    private double others;

    public SubscriptionExpenseCalculator(double income, double ott,
            double music, double cloudStorage, double gym, double others) {
        this.income = income;
        this.ott = ott;
        this.music = music;
        this.cloudStorage = cloudStorage;
        this.gym = gym;
        this.others = others;
    }

    public double calculateMonthlyTotal() {
        return ott + music + cloudStorage + gym + others;
    }

    public double calculateAnnualTotal() {
        return calculateMonthlyTotal() * 12;
    }

    public double calculateIncomePercentage() {
        return calculateMonthlyTotal() / income * 100;
    }

    public String findHighestSubscription() {
        String name = "OTT";
        double highest = ott;

        if (music > highest) {
            highest = music;
            name = "Music";
        }
        if (cloudStorage > highest) {
            highest = cloudStorage;
            name = "Cloud Storage";
        }
        if (gym > highest) {
            highest = gym;
            name = "Gym";
        }
        if (others > highest) {
            name = "Others";
        }

        return name;
    }

    public void displayReport() {
        double monthlyTotal = calculateMonthlyTotal();

        System.out.println();
        System.out.println("-------- SUBSCRIPTION SUMMARY --------");
        System.out.printf("OTT Subscription     : Rs. %.2f%n", ott);
        System.out.printf("Music Subscription   : Rs. %.2f%n", music);
        System.out.printf("Cloud Storage        : Rs. %.2f%n", cloudStorage);
        System.out.printf("Gym Membership       : Rs. %.2f%n", gym);
        System.out.printf("Other Subscriptions  : Rs. %.2f%n", others);
        System.out.println("--------------------------------------");
        System.out.printf("Monthly Total        : Rs. %.2f%n", monthlyTotal);
        System.out.printf("Annual Total         : Rs. %.2f%n", calculateAnnualTotal());
        System.out.printf("Income Used          : %.2f%%%n", calculateIncomePercentage());
        System.out.printf("Highest Subscription : %s%n", findHighestSubscription());

        if (monthlyTotal == 0) {
            System.out.println("Status: No subscription expenses recorded.");
        } else if (calculateIncomePercentage() > 10) {
            System.out.println("Alert: Subscription spending is high.");
            System.out.println("Suggestion: Review subscriptions you rarely use.");
        } else if (calculateIncomePercentage() > 5) {
            System.out.println("Status: Subscription spending is moderate.");
        } else {
            System.out.println("Status: Subscription spending is under control.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] prompts = {
            "Enter monthly income: Rs. ",
            "Enter OTT subscription cost: Rs. ",
            "Enter music subscription cost: Rs. ",
            "Enter cloud storage cost: Rs. ",
            "Enter gym membership cost: Rs. ",
            "Enter other subscription costs: Rs. "
        };

        double[] values = new double[prompts.length];

        for (int i = 0; i < prompts.length; i++) {
            System.out.print(prompts[i]);

            if (!sc.hasNextDouble()) {
                System.out.println("Please enter a valid number.");
                sc.close();
                return;
            }

            values[i] = sc.nextDouble();

            if (!Double.isFinite(values[i])) {
                System.out.println("Please enter a finite number.");
                sc.close();
                return;
            }
        }

        if (values[0] <= 0) {
            System.out.println("Monthly income must be greater than zero.");
            sc.close();
            return;
        }

        for (int i = 1; i < values.length; i++) {
            if (values[i] < 0) {
                System.out.println("Subscription costs cannot be negative.");
                sc.close();
                return;
            }
        }

        SubscriptionExpenseCalculator calculator =
                new SubscriptionExpenseCalculator(
                        values[0], values[1], values[2],
                        values[3], values[4], values[5]);

        calculator.displayReport();
        sc.close();
    }
}
