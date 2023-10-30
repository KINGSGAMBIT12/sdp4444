import java.util.ArrayList;
import java.util.List;

class MarketExchange implements StockMarket {
    private List<StockBroker> brokers = new ArrayList<>();

    public void registerBroker(StockBroker broker) {
        brokers.add(broker);
    }

    public void removeBroker(StockBroker broker) {
        brokers.remove(broker);
    }

    public void updateStockPrice(String stockName, double stockPrice) {
        notifyBrokers(stockName, stockPrice);
    }

    public void notifyBrokers(String stockName, double stockPrice) {
        for (StockBroker broker : brokers) {
            broker.update(stockName, stockPrice);
        }
    }
}
