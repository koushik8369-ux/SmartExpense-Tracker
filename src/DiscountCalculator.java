import java.util.Scanner;

public class DiscountCalculator {

    private double price;
    private double discountPercent;

    public DiscountCalculator(double price, double discountPercent) {
        this.price = price;
        this.discountPercent = discountPercent;
    }

    public double calculateDiscount() {
        return price * discountPercent / 100;
    }

    public double calculateFinalPrice() {
        return price - calculateDiscount();
    }

    public void displaySummary() {
        System.out.println("\n--- Discount Summary ---");
        System.out.printf("Original Price: Rs. %.2f%n", price);
        System.out.printf("Discount: Rs. %.2f%n", calculateDiscount());
        System.out.printf("Final Price: Rs. %.2f%n", calculateFinalPrice());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original price: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid price. Enter a number.");
            sc.close();
            return;
        }
        double price = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid discount. Enter a number.");
            sc.close();
            return;
        }
        double discount = sc.nextDouble();

        if (price < 0 || discount < 0 || discount > 100) {
            System.out.println("Price must be non-negative and discount must be between 0 and 100.");
            sc.close();
            return;
        }

        DiscountCalculator calculator = new DiscountCalculator(price, discount);
        calculator.displaySummary();

        sc.close();
    }
}
