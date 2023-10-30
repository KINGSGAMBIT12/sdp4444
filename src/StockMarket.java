interface StockMarket {
    void registerBroker(StockBroker broker);
    void removeBroker(StockBroker broker);
    void notifyBrokers(String stockName, double stockPrice);
}