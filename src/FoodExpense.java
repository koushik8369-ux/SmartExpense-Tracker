public class FoodExpense extends ExpenseCategory {
    @Override
    public double calculateExpense(double amount) {
        return amount;
    }

    public static void main(String[] args) {
        FoodExpense food = new FoodExpense();
        food.displayCategory("Food");

        double total = food.calculateExpense(350);
        System.out.println("Total Expense: Rs. " + total);
    }
}
