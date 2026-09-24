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
│   ├── SavingsGoalPlanner.java
│   ├── DailyExpenseLimitCalculator.java
│   ├── DebtRepaymentPlanner.java
│   ├── SubscriptionExpenseCalculator.java
│   ├── CreditCardUsageAlert.java
│   ├── FixedDepositCalculator.java
│   ├── SalaryAllocationPlanner.java
│   ├── InsurancePremiumEstimator.java
│   ├── LoanEligibilityChecker.java
│   └── SIPInvestmentCalculator.java
├── .gitignore
└── README.md
```

---

## ▶️ How to Compile

Compile all Java programs:

```powershell
javac -encoding UTF-8 -d out src\*.java
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

## 🆕 Latest Financial Tools

### 💸 6. Debt Repayment Planner

📄 **File:** `src/DebtRepaymentPlanner.java`

Calculates loan interest, estimated repayment duration, and total payment based on the user's monthly payment capacity.

#### ✨ Features

- Calculates total loan interest
- Estimates repayment duration
- Detects insufficient monthly payments
- Provides debt-repayment suggestions

Run: `java -cp out DebtRepaymentPlanner`

---

### 📺 7. Subscription Expense Calculator

📄 **File:** `src/SubscriptionExpenseCalculator.java`

Analyzes recurring subscriptions and calculates their monthly and annual financial impact.

#### ✨ Features

- Records multiple subscription categories
- Calculates monthly and annual costs
- Identifies the highest-cost subscription
- Calculates the percentage of income used
- Provides subscription-spending alerts

Run: `java -cp out SubscriptionExpenseCalculator`

---

### 📆 8. Daily Expense Limit Calculator

📄 **File:** `src/DailyExpenseLimitCalculator.java`

Calculates a recommended daily spending limit after allocating money for fixed expenses and savings.

#### ✨ Features

- Calculates flexible monthly budget
- Calculates weekly and daily spending limits
- Validates the number of days
- Detects budget shortages
- Provides daily-spending guidance

Run: `java -cp out DailyExpenseLimitCalculator`

---
## 📈 Investment, Salary and Credit Tools

### 🏦 9. Fixed Deposit Maturity Calculator

📄 **File:** `src/FixedDepositCalculator.java`

Calculates the maturity value of a fixed deposit using compound interest.

#### ✨ Features

- Accepts deposit amount and interest rate
- Supports yearly, half-yearly and quarterly compounding
- Calculates total interest earned
- Calculates final maturity amount
- Displays investment growth percentage
- Identifies short, medium and long-term deposits

Run: `java -cp out FixedDepositCalculator`

---

### 💼 10. Salary Allocation Planner

📄 **File:** `src/SalaryAllocationPlanner.java`

Calculates take-home salary and creates a recommended allocation plan for monthly income.

#### ✨ Features

- Accepts gross salary and deductions
- Calculates net salary
- Calculates deduction percentage
- Allocates money for essential expenses
- Allocates money for savings and investments
- Allocates money for personal use and emergencies
- Detects high salary deductions

Run: `java -cp out SalaryAllocationPlanner`

---

### 💳 11. Credit Card Usage Alert

📄 **File:** `src/CreditCardUsageAlert.java`

Monitors credit-card usage and provides alerts based on credit utilization.

#### ✨ Features

- Records credit limit and outstanding amount
- Checks whether a new purchase is affordable
- Calculates updated outstanding balance
- Calculates remaining available credit
- Calculates credit-utilization percentage
- Calculates minimum payment
- Detects high and critical credit usage
- Rejects purchases exceeding the credit limit

Run: `java -cp out CreditCardUsageAlert`

---
## 🚀 Investment, Loan and Insurance Tools

### 📈 12. SIP Investment Calculator

📄 **File:** `src/SIPInvestmentCalculator.java`

Estimates the future value of monthly Systematic Investment Plan contributions using compound growth.

#### ✨ Features

- Accepts monthly investment amount
- Accepts expected annual return
- Supports different investment durations
- Calculates total amount invested
- Calculates estimated investment returns
- Calculates expected maturity amount
- Displays investment growth percentage
- Provides duration-based guidance

Run: `java -cp out SIPInvestmentCalculator`

---

### 🏠 13. Home Loan Eligibility Checker

📄 **File:** `src/LoanEligibilityChecker.java`

Calculates the estimated home-loan EMI and checks repayment eligibility using monthly income and existing financial obligations.

#### ✨ Features

- Accepts income and existing EMI
- Calculates estimated new EMI
- Calculates total monthly EMI
- Calculates debt-to-income ratio
- Applies a safe 50% EMI limit
- Displays remaining monthly income
- Determines loan eligibility
- Provides repayment suggestions

Run: `java -cp out LoanEligibilityChecker`

---

### 🛡️ 14. Health Insurance Premium Estimator

📄 **File:** `src/InsurancePremiumEstimator.java`

Provides an educational insurance-premium estimate using age, coverage, smoking status, and existing medical conditions.

#### ✨ Features

- Accepts applicant and coverage details
- Calculates base insurance premium
- Applies age-based charges
- Applies smoking and medical-condition charges
- Calculates annual premium
- Calculates monthly premium
- Displays estimated risk level
- Validates incorrect input

Run: `java -cp out InsurancePremiumEstimator`

> **Note:** The calculated premium is an educational estimate. Actual premiums depend on the insurance provider and policy conditions.

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
