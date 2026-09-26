import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original price: ");
        double price = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();

        double discountAmount = price * discountPercent / 100;
        double finalPrice = price - discountAmount;

        System.out.println("\n--- Discount Summary ---");
        System.out.println("Original Price: Rs. " + price);
        System.out.println("Discount: Rs. " + discountAmount);
        System.out.println("Final Price: Rs. " + finalPrice);

        sc.close();
    }
}