public class Expense {
    private String category;
    private double amount;

    public Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public void displayExpense() {
        System.out.println("Category: " + category);
        System.out.println("Amount: Rs. " + amount);
    }

    public static void main(String[] args) {
        Expense expense = new Expense("Food", 250);
        expense.displayExpense();
    }
}
