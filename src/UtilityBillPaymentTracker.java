import java.util.Scanner;

public class UtilityBillPaymentTracker {
    private double electricityBill;
    private double waterBill;
    private double internetBill;

    public UtilityBillPaymentTracker(double electricityBill,
                                     double waterBill, double internetBill) {
        this.electricityBill = electricityBill;
        this.waterBill = waterBill;
        this.internetBill = internetBill;
    }

    public double calculateTotal() {
        return electricityBill + waterBill + internetBill;
    }

    public void displayReport() {
        System.out.println("\n===== UTILITY BILL REPORT =====");
        System.out.printf("Electricity Bill: Rs. %.2f%n", electricityBill);
        System.out.printf("Water Bill: Rs. %.2f%n", waterBill);
        System.out.printf("Internet Bill: Rs. %.2f%n", internetBill);
        System.out.printf("Total Amount: Rs. %.2f%n", calculateTotal());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity bill: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double electricity = sc.nextDouble();

        System.out.print("Enter water bill: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double water = sc.nextDouble();

        System.out.print("Enter internet bill: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid amount.");
            sc.close();
            return;
        }
        double internet = sc.nextDouble();

        if (!Double.isFinite(electricity) || !Double.isFinite(water)
                || !Double.isFinite(internet) || electricity < 0
                || water < 0 || internet < 0) {
            System.out.println("Bills cannot be negative or invalid.");
            sc.close();
            return;
        }

        UtilityBillPaymentTracker tracker =
                new UtilityBillPaymentTracker(electricity, water, internet);
        tracker.displayReport();
        sc.close();
    }
}
