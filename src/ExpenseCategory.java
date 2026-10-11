public abstract class ExpenseCategory {
    public abstract double calculateExpense(double amount);

    public void displayCategory(String name) {
        System.out.println("Expense Category: " + name);
    }
}
