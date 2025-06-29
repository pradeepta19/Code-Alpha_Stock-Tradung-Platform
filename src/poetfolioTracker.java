import java.util.*;

class PoetfolioTracker {
    static Map<String, Stock> market = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize stock market
        market.put("AAPL", new Stock("AAPL", 150.0, 5.0));
        market.put("GOOG", new Stock("GOOG", 2700.0, 30.0));
        market.put("TSLA", new Stock("TSLA", 700.0, 20.0));
        market.put("INFY", new Stock("INFY", 1500.0, 50.0));

        // Create a user
        User user = new User("Pradeepta", 10000.0);

        while (true) {
            System.out.println("\n=== Stock Trading Simulator ===");
            System.out.println("1. View Market");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Simulate Market (Next Day)");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: displayMarket(); break;
                case 2: buyStock(user); break;
                case 3: sellStock(user); break;
                case 4: user.displayPortfolio(market); break;
                case 5: simulateMarket(); break;
                case 6: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice.");
            }
        }
    }

    static void displayMarket() {
        System.out.println("\n--- Market Data ---");
        for (Stock stock : market.values()) {
            System.out.println(stock);
        }
    }

    static void buyStock(User user) {
        System.out.print("Enter stock symbol to buy: ");
        String symbol = sc.next().toUpperCase();
        if (!market.containsKey(symbol)) {
            System.out.println("❌ Stock not found.");
            return;
        }
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        user.buy(symbol, qty, market.get(symbol).price);
    }

    static void sellStock(User user) {
        System.out.print("Enter stock symbol to sell: ");
        String symbol = sc.next().toUpperCase();
        if (!market.containsKey(symbol)) {
            System.out.println("❌ Stock not found.");
            return;
        }
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        user.sell(symbol, qty, market.get(symbol).price);
    }

    static void simulateMarket() {
        for (Stock stock : market.values()) {
            stock.updatePrice();
        }
        System.out.println("📈 Market updated with new prices.");
    }
}

