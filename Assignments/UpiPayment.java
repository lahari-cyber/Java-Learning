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

class UpiPayment implements Payable, Taxable, Loggable {

    private String upiId;
    private String status = "PENDING";
    private double amount;
    private double tax;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        System.out.println("Processing UPI payment: ₹" + amount);
        this.status = "SUCCESS";
        logActivity("payment");
    }

    @Override
    public String getPaymentStatus() {
        return status;
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding amount: ₹" + amount);
        this.status = "REFUNDED";
        logActivity("refund");
    }

    @Override
    public double calculateTax() {
        this.tax = amount * 0.05;
        return tax;
    }

    @Override
    public void generateTaxvoic() {
        System.out.println("Tax Invoice:");
        System.out.println("Transaction: UPI");
        System.out.println("Amount: " + amount);
        System.out.println("GST (5%): " + tax);
        System.out.println("Total: " + (amount + tax));
    }

    @Override
    public void logActivity(String action) {
        System.out.println("Activity Logged: " + action);
    }

    public static void main(String[] args) {

        UpiPayment payment = new UpiPayment("lahari@upi");

        payment.processPayment(1000);

        System.out.println("Payment Status: " + payment.getPaymentStatus());

        payment.calculateTax();

        payment.generateTaxvoic();

        payment.refundPayment(1000);

        System.out.println("Payment Status: " + payment.getPaymentStatus());
    }
}