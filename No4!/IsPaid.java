class IsPaid {
    private boolean paid;

    public IsPaid() {
        this.paid = false;
    }

    public void markAsPaid() {
        this.paid = true;
    }

    public boolean getPaymentStatus() {
        return paid;
    }
}
