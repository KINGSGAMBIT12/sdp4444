class IndividualBroker implements StockBroker {
    private String name;

    public IndividualBroker(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println(name + " received update: " + stockName + " is now priced at $" + stockPrice);
    }
}