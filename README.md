# 💰 Smart Expense Tracker

A professional Java console-based financial toolkit that helps users track expenses, plan monthly budgets, set savings goals, and build an emergency fund.

This repository preserves the original beginner program while demonstrating its gradual development into a collection of practical personal-finance applications.

---

## 📌 Problem Statement

Many people find it difficult to manage their income, monitor expenses, maintain savings, and prepare for financial emergencies.

The **Smart Expense Tracker** provides simple Java-based tools that help users:

- Track monthly spending
- Analyze financial habits
- Plan a monthly budget
- Estimate savings-goal completion
- Build an emergency fund
- Make better financial decisions

---

## 🚀 Applications Included

### 🌱 1. Basic Expense Tracker

📄 **File:** `src/BasicExpenseTracker.java`

The original version accepts monthly income and total expenses, calculates the remaining balance, and provides a basic spending warning.

#### ✨ Features

- Accepts monthly income and expenses
- Calculates the remaining balance
- Detects overspending
- Warns about high expenditure
- Displays financial status

---

### 🧠 2. Advanced Smart Expense Tracker

📄 **File:** `src/Main.java`

The advanced version records category-based expenses and provides detailed financial analysis.

#### ✨ Features

- Records six expense categories
- Calculates total expenses
- Calculates remaining balance
- Displays spending percentage
- Displays savings percentage
- Identifies the highest expense category
- Detects high spending and overspending
- Provides financial suggestions
- Validates incorrect values

---

### 🎯 3. Savings Goal Planner

📄 **File:** `src/SavingsGoalPlanner.java`

Helps users estimate how long it will take to achieve a financial goal.

#### ✨ Features

- Accepts a savings target
- Accepts current savings
- Accepts monthly saving capacity
- Calculates the remaining amount
- Calculates goal progress
- Estimates the required number of months
- Displays goal-achievement guidance

---

### 🛡️ 4. Emergency Fund Calculator

📄 **File:** `src/EmergencyFundCalculator.java`

Calculates the emergency fund required to cover essential expenses for a selected number of months.

#### ✨ Features

- Accepts monthly essential expenses
- Supports coverage between 3 and 12 months
- Calculates the required emergency fund
- Calculates current fund progress
- Calculates the remaining amount
- Displays emergency-fund status

---

### 📅 5. Monthly Budget Planner

📄 **File:** `src/MonthlyBudgetPlanner.java`

Creates a budget using the **50/30/20 rule**.

| Budget Category | Percentage | Purpose |
|---|---:|---|
| 🏠 Needs | 50% | Rent, food, bills and essential expenses |
| 🎉 Wants | 30% | Shopping, entertainment and optional expenses |
| 🏦 Savings | 20% | Savings, investments and financial goals |

#### ✨ Features

- Accepts user name and monthly income
- Calculates the monthly budget allocation
- Creates a weekly budget guide
- Separates needs, wants and savings
- Provides savings suggestions
- Validates incorrect income values

---

## 📊 Expense Categories

| Symbol | Category | Examples |
|:---:|---|---|
| 🍔 | Food | Meals, groceries and snacks |
| 🚌 | Travel | Fuel and transportation |
| 🛍️ | Shopping | Clothes and personal purchases |
| 🧾 | Bills | Electricity, mobile and internet |
| 🎓 | Education | Fees, books and courses |
| 📦 | Others | Additional expenses |

---

## 🚦 Spending Status Rules

| Condition | Status |
|---|---|
| Expenses exceed income | 🚨 Overspending |
| Spending is 80% or more | ⚠️ High Spending |
| Spending is between 50% and 79.99% | 📊 Moderate Spending |
| Spending is below 50% | ✅ Spending Under Control |

---

## 🛠️ Technologies Used

- ☕ Java 17
- 🖥️ Visual Studio Code
- 📥 Java Scanner
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
│   ├── EmergencyFundCalculator.java
│   ├── Main.java
│   ├── MonthlyBudgetPlanner.java
│   └── SavingsGoalPlanner.java
├── .gitignore
└── README.md
```

---

## ▶️ How to Compile

Compile all Java programs:

```powershell
javac -encoding UTF-8 -d out src\BasicExpenseTracker.java src\EmergencyFundCalculator.java src\Main.java src\MonthlyBudgetPlanner.java src\SavingsGoalPlanner.java
```

---

## ▶️ How to Run

### 🌱 Basic Expense Tracker

```powershell
java -cp out BasicExpenseTracker
```

### 🧠 Advanced Smart Expense Tracker

```powershell
java -cp out Main
```

### 🎯 Savings Goal Planner

```powershell
java -cp out SavingsGoalPlanner
```

### 🛡️ Emergency Fund Calculator

```powershell
java -cp out EmergencyFundCalculator
```

### 📅 Monthly Budget Planner

```powershell
java -cp out MonthlyBudgetPlanner
```

---

## 🧠 Java Concepts Demonstrated

- Variables and primitive data types
- User input using `Scanner`
- Arithmetic operators
- Conditional statements
- Logical operators
- Input validation
- Percentage calculations
- Type casting
- `Math.ceil()`
- Formatted output using `printf`
- Classes and main methods

---

## 📈 Project Development

1. 🌱 Created the basic expense tracker
2. 📂 Added category-based expense tracking
3. 📊 Added financial analysis and alerts
4. 🎯 Added savings-goal planning
5. 🛡️ Added emergency-fund calculation
6. 📅 Added monthly budget allocation
7. 📖 Added professional documentation

---

## 🔮 Future Enhancements

- 💾 Save financial records in files
- 🗃️ Connect the application to a database
- 📉 Generate expense charts
- 🔐 Add user registration and login
- 🖼️ Build a Java Swing or JavaFX interface
- 🌐 Develop a web-based version
- 📱 Create a mobile application

---

## ✅ Conclusion

The **Smart Expense Tracker** demonstrates how beginner-friendly Java concepts can be applied to real-world personal-finance problems. The project contains multiple tools for tracking expenses, planning budgets, achieving savings goals, and preparing for emergencies.

---

## 👨‍💻 Maintainer

**koushik8369-ux**

---

⭐ If you find this project helpful, consider giving the repository a star!