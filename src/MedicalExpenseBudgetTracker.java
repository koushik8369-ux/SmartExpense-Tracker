import java.util.Scanner;

public class MedicalExpenseBudgetTracker {

    private double budget;
    private double hospitalExpense;
    private double medicineExpense;
    private double testExpense;
    private double otherExpense;

    public MedicalExpenseBudgetTracker(double budget, double hospitalExpense,
                                       double medicineExpense,
                                       double testExpense, double otherExpense) {
        this.budget = budget;
        this.hospitalExpense = hospitalExpense;
        this.medicineExpense = medicineExpense;
        this.testExpense = testExpense;
        this.otherExpense = otherExpense;
    }

    public double calculateTotalExpense() {
        return hospitalExpense + medicineExpense
                + testExpense + otherExpense;
    }

    public double calculateRemainingBudget() {
        return budget - calculateTotalExpense();
    }

    public void displayReport() {
        System.out.println("\n===== MEDICAL EXPENSE REPORT =====");
        System.out.printf("Medical Budget: Rs. %.2f%n", budget);
        System.out.printf("Hospital Expense: Rs. %.2f%n", hospitalExpense);
        System.out.printf("Medicine Expense: Rs. %.2f%n", medicineExpense);
        System.out.printf("Test Expense: Rs. %.2f%n", testExpense);
        System.out.printf("Other Expense: Rs. %.2f%n", otherExpense);
        System.out.printf("Total Medical Expense: Rs. %.2f%n",
                calculateTotalExpense());

        if (calculateRemainingBudget() >= 0) {
            System.out.printf("Remaining Budget: Rs. %.2f%n",
                    calculateRemainingBudget());
            System.out.println("Medical expenses are within budget.");
        } else {
            System.out.printf("Budget Exceeded: Rs. %.2f%n",
                    Math.abs(calculateRemainingBudget()));
            System.out.println("Medical budget has been exceeded.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter medical budget: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double budget = sc.nextDouble();

        System.out.print("Enter hospital expense: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double hospital = sc.nextDouble();

        System.out.print("Enter medicine expense: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double medicine = sc.nextDouble();

        System.out.print("Enter laboratory test expense: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double tests = sc.nextDouble();

        System.out.print("Enter other medical expenses: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double other = sc.nextDouble();

        if (!Double.isFinite(budget) || !Double.isFinite(hospital)
                || !Double.isFinite(medicine) || !Double.isFinite(tests)
                || !Double.isFinite(other) || budget <= 0
                || hospital < 0 || medicine < 0 || tests < 0 || other < 0
                || hospital > Double.MAX_VALUE - medicine
                || hospital + medicine > Double.MAX_VALUE - tests
                || hospital + medicine + tests > Double.MAX_VALUE - other) {
            System.out.println("Please enter valid expense details.");
            sc.close();
            return;
        }

        MedicalExpenseBudgetTracker tracker =
                new MedicalExpenseBudgetTracker(
                        budget, hospital, medicine, tests, other);

        tracker.displayReport();
        sc.close();
    }
}
