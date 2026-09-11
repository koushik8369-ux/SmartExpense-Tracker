# 💰 Smart Expense Tracker

A beginner-friendly Java console application that records category-based monthly expenses, analyzes spending habits, calculates savings, and provides smart financial alerts.

## 📌 Problem Statement

Many people know how much they spend each month but cannot clearly identify where their money is going. The Smart Expense Tracker helps users record expenses under different categories, calculate their total spending and remaining balance, identify the highest-spending category, and receive alerts when expenses become too high.

## ✨ Features

- Accepts the user's monthly income
- Records expenses under six categories
- Calculates total monthly expenses
- Calculates the remaining balance
- Displays spending and savings percentages
- Identifies the highest-spending category
- Detects overspending
- Warns when spending reaches 80% of income
- Provides financial status and suggestions
- Validates income and expense values
- Displays a formatted monthly summary

## 📊 Expense Categories

- Food
- Travel
- Shopping
- Bills
- Education
- Others

## 🚦 Financial Status

| Condition | Status |
|---|---|
| Expenses exceed income | Overspending |
| Spending is 80% or more | High Spending |
| Spending is 50% to 79.99% | Moderate Spending |
| Spending is below 50% | Spending Under Control |

## 🛠️ Technologies Used

- Java 17
- Java Scanner
- Conditional statements
- Arithmetic operators
- Formatted console output
- Git and GitHub
- Visual Studio Code

## 📂 Project Structure

```text
SmartExpense-Tracker/
├── src/
│   └── Main.java
├── .gitignore
└── README.md
```

## ▶️ How to Run

### 1. Compile the program

```powershell
javac -encoding UTF-8 -d out src\Main.java
```

### 2. Run the program

```powershell
java -cp out Main
```

## 📸 Sample Output

```text
================================
     SMART EXPENSE TRACKER
================================
Enter monthly income: 65000
Enter food expenses: 5000
Enter travel expenses: 5000
Enter shopping expenses: 10000
Enter bill expenses: 3500
Enter education expenses: 25000
Enter other expenses: 4000

========== MONTHLY SUMMARY ==========
Monthly Income      : Rs. 65000.00
Food Expenses       : Rs. 5000.00
Travel Expenses     : Rs. 5000.00
Shopping Expenses   : Rs. 10000.00
Bill Expenses       : Rs. 3500.00
Education Expenses  : Rs. 25000.00
Other Expenses      : Rs. 4000.00
-------------------------------------
Total Expenses      : Rs. 52500.00
Remaining Balance   : Rs. 12500.00
Spending Percentage : 80.77%
Savings Percentage  : 19.23%
Highest Category    : Education (Rs. 25000.00)
-------------------------------------
Financial Status: HIGH SPENDING
Alert: Try to reduce unnecessary expenses.
=====================================
```

## 🧠 Java Concepts Used

- Variables and data types
- User input using `Scanner`
- Arithmetic calculations
- `if-else` conditions
- Logical operators
- Input validation
- Formatted output using `printf`
- Percentage calculations

## 🔮 Future Enhancements

- Record individual expense transactions
- Store expense records in a file or database
- Generate weekly and yearly reports
- Add login functionality
- Create a graphical user interface
- Display expense charts

## ✅ Conclusion

Smart Expense Tracker provides a simple way to understand monthly spending habits. It helps users monitor expenses, identify their highest-spending category, and make better financial decisions.