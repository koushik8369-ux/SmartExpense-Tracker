# 💰 Smart Expense Tracker

A professional Java console application designed to monitor monthly expenses, analyze spending habits, calculate savings, and provide intelligent financial alerts.

This repository contains both the **basic version** and the **advanced version** of the Smart Expense Tracker, demonstrating the gradual improvement of the project.

---

## 📌 Problem Statement

Many people struggle to understand where their monthly income is being spent. Manually calculating expenses can make it difficult to monitor spending, identify costly categories, and maintain sufficient savings.

The **Smart Expense Tracker** solves this problem by recording monthly income and expenses, calculating the remaining balance, analyzing spending percentages, identifying the highest-spending category, and providing useful financial alerts.

---

## 🚀 Project Versions

### 🌱 1. Basic Expense Tracker

The original beginner-friendly version of the application.

📄 **File:** `src/BasicExpenseTracker.java`

#### ✨ Basic Features

- 💵 Accepts monthly income
- 🧾 Accepts total monthly expenses
- 🧮 Calculates the remaining balance
- ⚠️ Detects overspending
- 📊 Warns when expenses exceed 80% of income
- ✅ Displays the user's financial status

---

### 🧠 2. Advanced Smart Expense Tracker

The upgraded version provides detailed category-based expense tracking and intelligent financial analysis.

📄 **File:** `src/Main.java`

#### ✨ Advanced Features

- 💵 Accepts monthly income
- 🍔 Records food expenses
- 🚌 Records travel expenses
- 🛍️ Records shopping expenses
- 🧾 Records bill expenses
- 🎓 Records education expenses
- 📦 Records other expenses
- 🧮 Calculates total monthly expenses
- 💰 Calculates the remaining balance
- 📊 Calculates spending percentage
- 🏦 Calculates savings percentage
- 🔝 Identifies the highest-spending category
- ⚠️ Detects high spending
- 🚨 Detects overspending
- 💡 Provides smart financial suggestions
- ✅ Validates income and expense values
- 🖥️ Displays a formatted monthly summary

---

## 📊 Expense Categories

| Symbol | Category | Description |
|:---:|---|---|
| 🍔 | Food | Meals, groceries and snacks |
| 🚌 | Travel | Fuel, bus, train and transportation |
| 🛍️ | Shopping | Clothes, accessories and personal purchases |
| 🧾 | Bills | Electricity, mobile, internet and other bills |
| 🎓 | Education | Fees, books and learning expenses |
| 📦 | Others | Expenses that do not belong to other categories |

---

## 🚦 Financial Status Rules

| Spending Condition | Financial Status |
|---|---|
| Expenses exceed monthly income | 🚨 Overspending |
| Spending is 80% or more | ⚠️ High Spending |
| Spending is between 50% and 79.99% | 📊 Moderate Spending |
| Spending is below 50% | ✅ Spending Under Control |

---

## 🛠️ Technologies Used

- ☕ Java 17
- 🖥️ Visual Studio Code
- 📥 Java `Scanner`
- 🔀 Conditional statements
- ➕ Arithmetic operators
- 🧮 Percentage calculations
- 📝 Formatted console output
- 🌿 Git
- 🌐 GitHub

---

## 📂 Project Structure

```text
SmartExpense-Tracker/
├── src/
│   ├── BasicExpenseTracker.java
│   └── Main.java
├── .gitignore
└── README.md
```

---

## ▶️ How to Run

### 1️⃣ Compile Both Programs

```powershell
javac -encoding UTF-8 -d out src\BasicExpenseTracker.java src\Main.java
```

### 2️⃣ Run the Basic Version

```powershell
java -cp out BasicExpenseTracker
```

### 3️⃣ Run the Advanced Version

```powershell
java -cp out Main
```

---

## 📸 Advanced Version Sample Output

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

---

## 🧠 Java Concepts Used

- Variables and data types
- User input using `Scanner`
- Arithmetic calculations
- `if-else` conditions
- Logical operators
- Input validation
- Percentage calculations
- Formatted output using `printf`
- Classes and main methods

---

## 📈 Project Development

The project demonstrates gradual improvement through two versions:

1. 🌱 Started with basic income and expense calculation
2. 📂 Added category-based expense tracking
3. 📊 Added spending and savings percentage calculations
4. 🔝 Added highest-expense category detection
5. 🚨 Added intelligent financial alerts
6. 📖 Added professional project documentation

---

## 🔮 Future Enhancements

- 💾 Save expense records in files
- 🗃️ Connect the application to a database
- 📅 Generate weekly and yearly reports
- 🔐 Add user registration and login
- 📉 Generate graphical expense charts
- 🖼️ Create a Java Swing or JavaFX interface
- 🌐 Develop a web-based version
- 📱 Create a mobile application

---

## ✅ Conclusion

The **Smart Expense Tracker** provides a simple and effective way to monitor monthly spending. By preserving both the basic and advanced versions, this repository also demonstrates how a beginner-level Java program can gradually evolve into a more useful and professional application.

---

⭐ If you find this project helpful, consider giving the repository a star!