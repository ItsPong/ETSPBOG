class TotalPrice {
    private double amount;

    public TotalPrice() {
        this.amount = 0.0;
    }

    public void addAmount(double price) {
        this.amount += price;
    }

    public void subtractAmount(double price) {
        this.amount -= price;
    }

    public double getTotalAmount() {
        return amount;
    }
}
