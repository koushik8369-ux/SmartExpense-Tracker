public class ExpenseManager {
    private Expense expense;

    public ExpenseManager(Expense expense) {
        this.expense = expense;
    }

    public void showExpense() {
        System.out.println("Managed Expense Details:");
        expense.display();
    }

    public static void main(String[] args) {
        Expense expense = new Expense("Travel", 450);
        ExpenseManager manager = new ExpenseManager(expense);
        manager.showExpense();
    }
}
