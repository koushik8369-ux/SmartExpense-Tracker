public class UPIExpensePayment extends ExpensePayment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI");
    }

    public static void main(String[] args) {
        ExpensePayment payment = new UPIExpensePayment();
        payment.pay(500);
    }
}
