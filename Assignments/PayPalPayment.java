interface Payable {
    void processPayment(double amount);
    String getPaymentStatus();
    void refundPayment(double amount);
}

interface Taxable {
    double calculateTax();
    void generateTaxvoic();
}

interface Loggable {
    void logActivity(String action);
}

class PayPalPayment implements Payable, Taxable, Loggable {

    private String email;
    private String status = "PENDING";
    private double amount;
    private double tax;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        System.out.println("Processing PayPal payment: $" + amount);
        this.status = "SUCCESS";
        logActivity("payment");
    }

    @Override
    public String getPaymentStatus() {
        return status;
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding amount: $" + amount);
        this.status = "REFUNDED";
        logActivity("refund");
    }

    @Override
    public double calculateTax() {
        this.tax = amount * 0.10;
        return tax;
    }

    @Override
    public void generateTaxvoic() {
        System.out.println("Tax Invoice:");
        System.out.println("Transaction: PayPal");
        System.out.println("Amount: " + amount);
        System.out.println("GST (10%): " + tax);
        System.out.println("Total: " + (amount + tax));
    }

    @Override
    public void logActivity(String action) {
        System.out.println("Activity Logged: " + action);
    }

    public static void main(String[] args) {

        PayPalPayment payment = new PayPalPayment("lahari@gmail.com");

        payment.processPayment(2000);

        System.out.println("Payment Status: " + payment.getPaymentStatus());

        payment.calculateTax();

        payment.generateTaxvoic();

        payment.refundPayment(2000);

        System.out.println("Payment Status: " + payment.getPaymentStatus());
    }
}