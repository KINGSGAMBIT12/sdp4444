class InstitutionalBroker implements StockBroker {
    private String institution;

    public InstitutionalBroker(String institution) {
        this.institution = institution;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println(institution + " received update: " + stockName + " is now priced at $" + stockPrice);
    }
}