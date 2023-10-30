import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MarketExchange stockMarket = new MarketExchange();
        StockBroker individualBroker = new IndividualBroker("John Doe");
        StockBroker institutionalBroker = new InstitutionalBroker("XYZ Investments");


        stockMarket.registerBroker(individualBroker);
        stockMarket.registerBroker(institutionalBroker);


        stockMarket.updateStockPrice("ABC Corp", 100.50);
        stockMarket.updateStockPrice("XYZ Inc", 75.25);


        stockMarket.removeBroker(individualBroker);

     
        stockMarket.updateStockPrice("123 Ltd", 50.75);
    }
}