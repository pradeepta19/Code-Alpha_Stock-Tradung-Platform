import java.util.HashMap;
import java.util.Map;

public class User {
    String name;
    double balance;
    Map<String, Integer> holdings;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.holdings = new HashMap<>();
    }

    public void buy(String symbol, int quantity, double price) {
        double totalCost = quantity * price;
        if (balance >= totalCost) {
            balance -= totalCost;
            holdings.put(symbol, holdings.getOrDefault(symbol, 0) + quantity);
            System.out.println("✅ Bought " + quantity + " of " + symbol);
        } else {
            System.out.println("❌ Insufficient balance.");
        }
    }

    public void sell(String symbol, int quantity, double price) {
        int owned = holdings.getOrDefault(symbol, 0);
        if (owned >= quantity) {
            balance += quantity * price;
            holdings.put(symbol, owned - quantity);
            if (holdings.get(symbol) == 0) holdings.remove(symbol);
            System.out.println("✅ Sold " + quantity + " of " + symbol);
        } else {
            System.out.println("❌ Not enough shares.");
        }
    }

    public double getPortfolioValue(Map<String, Stock> market) {
        double total = 0;
        for (String symbol : holdings.keySet()) {
            int qty = holdings.get(symbol);
            double price = market.get(symbol).price;
            total += qty * price;
        }
        return total;
    }

    public void displayPortfolio(Map<String, Stock> market) {
        System.out.println("\n--- " + name + "'s Portfolio ---");
        for (String symbol : holdings.keySet()) {
            int qty = holdings.get(symbol);
            double price = market.get(symbol).price;
            double value = qty * price;
            System.out.println(symbol + ": " + qty + " @ $" + price + " = $" + value);
        }
        double totalValue = getPortfolioValue(market);
        System.out.println("Cash Balance: $" + balance);
        System.out.println("Total Portfolio Value: $" + (balance + totalValue));
    }
}

