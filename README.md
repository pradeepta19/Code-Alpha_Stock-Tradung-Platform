# 📈 Stock Trading Simulator (Java, Console-Based)

This is a beginner-friendly Java console application that simulates a basic stock trading environment using Object-Oriented Programming (OOP). It allows users to view stock market data, buy/sell stocks, and track portfolio performance over time.

---

## 🚀 Features

- 🧾 Display real-time simulated stock market data
- 💸 Buy and sell shares from the market
- 📊 Track your portfolio (cash + stocks value)
- 🔁 Simulate market fluctuation over time (random price changes)
- 🧠 Designed with Object-Oriented Programming (OOP) principles

---

## 🛠 Tech Stack

- **Language:** Java
- **IDE Recommended:** IntelliJ IDEA or VS Code
- **Java Version:** 8 or higher
- **No external libraries required**

---

## 📂 Project Structure

```
StockTradingSimulator/
├── Stock.java             // Stock class - handles price and symbol
├── User.java              // User class - handles balance, holdings, and actions
└── PortfolioTracker.java  // Main program (with menu and logic)
```

---

## 🧪 How to Run

### Option 1: Using IntelliJ IDEA
1. Open IntelliJ.
2. Create a new Java project.
3. Inside `src`, add three classes:
   - `Stock`
   - `User`
   - `PortfolioTracker` (with `main` method)
4. Copy code into each file.
5. Run `PortfolioTracker.java`.

### Option 2: Compile and Run from Terminal
```bash
javac *.java
java PortfolioTracker
```

---

## 📸 Demo

```
=== Stock Trading Simulator ===
1. View Market
2. Buy Stock
3. Sell Stock
4. View Portfolio
5. Simulate Market (Next Day)
6. Exit
```

---

## 🧱 OOP Concepts Used

- **Class & Object**: Stocks and Users are real-world entities modeled as classes.
- **Encapsulation**: Logic and data are kept inside their respective classes.
- **Abstraction**: Buy/sell/update operations abstract away internal logic.
- **Modularity**: Each file has a specific responsibility.

---

## 📌 To-Do / Future Features

- 💾 Add File I/O to save/load user data
- 📈 Add transaction history
- 📊 Include stock charts using JavaFX (GUI)
- 🧠 Add multiple users and login system

---

## 👤 Author

**Pradeepta Acharya**

---
