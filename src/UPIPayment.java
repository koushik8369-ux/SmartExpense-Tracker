public class UPIPayment extends PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying Rs. " + amount + " using UPI.");
        System.out.println("Payment successful!");
    }

    public static void main(String[] args) {
        UPIPayment payment = new UPIPayment();
        payment.pay(250);
    }
}
