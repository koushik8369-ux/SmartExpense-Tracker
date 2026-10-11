public class SavingsAccount {
    private String accountHolder;
    private double balance;

    public SavingsAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: Rs. " + balance);
    }

    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("Koushik", 1000);
        account.deposit(500);
        account.displayBalance();
    }
}

