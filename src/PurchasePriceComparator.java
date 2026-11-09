import java.util.Scanner;

public class PurchasePriceComparator {
    private String productOne;
    private String productTwo;
    private double priceOne;
    private double priceTwo;

    public PurchasePriceComparator(String productOne, double priceOne,
                                   String productTwo, double priceTwo) {
        this.productOne = productOne;
        this.priceOne = priceOne;
        this.productTwo = productTwo;
        this.priceTwo = priceTwo;
    }

    public double calculateDifference() {
        return Math.abs(priceOne - priceTwo);
    }

    public void displayComparison() {
        System.out.println("\n===== PRODUCT PRICE COMPARISON =====");
        System.out.printf("%s: Rs. %.2f%n", productOne, priceOne);
        System.out.printf("%s: Rs. %.2f%n", productTwo, priceTwo);

        if (priceOne < priceTwo) {
            System.out.println(productOne + " is cheaper.");
            System.out.printf("You save Rs. %.2f%n", calculateDifference());
        } else if (priceTwo < priceOne) {
            System.out.println(productTwo + " is cheaper.");
            System.out.printf("You save Rs. %.2f%n", calculateDifference());
        } else {
            System.out.println("Both products have the same price.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first product name: ");
        String nameOne = sc.nextLine().trim();

        System.out.print("Enter first product price: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid price.");
            sc.close();
            return;
        }
        double priceOne = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter second product name: ");
        String nameTwo = sc.nextLine().trim();

        System.out.print("Enter second product price: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid price.");
            sc.close();
            return;
        }
        double priceTwo = sc.nextDouble();

        if (nameOne.isEmpty() || nameTwo.isEmpty()
                || !Double.isFinite(priceOne) || !Double.isFinite(priceTwo)
                || priceOne < 0 || priceTwo < 0) {
            System.out.println("Enter valid product names and prices.");
            sc.close();
            return;
        }

        PurchasePriceComparator comparator =
                new PurchasePriceComparator(nameOne, priceOne, nameTwo, priceTwo);
        comparator.displayComparison();
        sc.close();
    }
}
