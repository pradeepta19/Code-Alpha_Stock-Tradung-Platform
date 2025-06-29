import java.util.Random;

public class Stock {
    String symbol;
    double price;
    double volatility;

    public Stock(String symbol, double price, double volatility) {
        this.symbol = symbol;
        this.price = price;
        this.volatility = volatility;
    }

    public void updatePrice() {
        Random rand = new Random();
        double change = (rand.nextDouble() * 2 - 1) * volatility;
        price = Math.max(1.0, Math.round((price + change) * 100.0) / 100.0);
    }

    public String toString() {
        return symbol + " : $" + price;
    }
}

