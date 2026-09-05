# 💰 Smart Expense Tracker

A professional Java console application that calculates monthly balance, monitors expenses, and provides smart spending alerts.

## 📌 Problem Statement

Many people struggle to monitor their monthly spending. Smart Expense Tracker accepts monthly income and expenses, calculates the remaining balance, and warns the user when spending becomes too high.

## ✨ Features

- 💵 Accepts monthly income
- 🧾 Accepts total expenses
- 🧮 Calculates the remaining balance
- ⚠️ Detects overspending
- 📊 Warns when expenses exceed 80% of income
- ✅ Displays the user's financial status
- 🖥️ Simple console-based interface

## 🛠️ Technologies Used

- Java 17
- Java Scanner
- Conditional statements
- Git
- GitHub

## 📂 Project Structure

SmartExpense-Tracker/
├── src/
│   └── Main.java
├── .gitignore
└── README.md

## ▶️ How to Run

Compile:

    javac -d out src\Main.java

Run:

    java -cp out Main

## 📸 Sample Output

### Spending Under Control

    Enter monthly income: 50000
    Enter total expenses: 25000
    Remaining balance: 25000.0
    Spending is under control.

### High Expenses

    Enter monthly income: 50000
    Enter total expenses: 45000
    Remaining balance: 5000.0
    Warning: Expenses are high.

### Overspending

    Enter monthly income: 30000
    Enter total expenses: 35000
    Remaining balance: -5000.0
    Warning: Expenses exceed income!

## 🧠 Concepts Demonstrated

- User input using Scanner
- Variables and arithmetic operators
- Conditional statements
- Percentage-based expense analysis
- Console input and output

## 🚀 Future Enhancements

- Add different expense categories
- Store transaction history
- Generate monthly reports
- Add savings goals
- Connect to a database
- Create a graphical interface

## 👨‍💻 Author

Developed as a Java learning project.

## ⭐ Support

If you like this project, give the repository a star!
