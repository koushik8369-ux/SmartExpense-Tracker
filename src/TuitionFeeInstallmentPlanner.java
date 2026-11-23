import java.util.Scanner;

public class TuitionFeeInstallmentPlanner {

    private double totalFee;
    private int totalInstallments;
    private int paidInstallments;

    public TuitionFeeInstallmentPlanner(double totalFee,
                                         int totalInstallments,
                                         int paidInstallments) {
        this.totalFee = totalFee;
        this.totalInstallments = totalInstallments;
        this.paidInstallments = paidInstallments;
    }

    public double calculateInstallmentAmount() {
        return totalFee / totalInstallments;
    }

    public double calculatePaidAmount() {
        return calculateInstallmentAmount() * paidInstallments;
    }

    public double calculateRemainingFee() {
        return totalFee - calculatePaidAmount();
    }

    public void displayReport() {
        System.out.println("\n===== TUITION FEE REPORT =====");
        System.out.printf("Total Fee: Rs. %.2f%n", totalFee);
        System.out.println("Total Installments: " + totalInstallments);
        System.out.println("Paid Installments: " + paidInstallments);
        System.out.printf("Amount Per Installment: Rs. %.2f%n",
                calculateInstallmentAmount());
        System.out.printf("Total Paid: Rs. %.2f%n", calculatePaidAmount());
        System.out.printf("Remaining Fee: Rs. %.2f%n",
                calculateRemainingFee());

        if (paidInstallments == totalInstallments) {
            System.out.println("All tuition fees have been paid!");
        } else {
            System.out.println("Some installments are still pending.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total tuition fee: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double fee = sc.nextDouble();

        System.out.print("Enter total number of installments: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid number.");
            sc.close();
            return;
        }
        int total = sc.nextInt();

        System.out.print("Enter installments already paid: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid number.");
            sc.close();
            return;
        }
        int paid = sc.nextInt();

        if (!Double.isFinite(fee) || fee <= 0
                || total <= 0 || paid < 0 || paid > total) {
            System.out.println("Please enter valid fee details.");
            sc.close();
            return;
        }

        TuitionFeeInstallmentPlanner planner =
                new TuitionFeeInstallmentPlanner(fee, total, paid);

        planner.displayReport();
        sc.close();
    }
}
