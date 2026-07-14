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

// A class can implement multiple interfaces!
class CreditCardPayment implements Payable, Taxable, Loggable {

    private String cardNumber;
    private String status = "PENDING";
    private double amount;
    private double tax;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
        
    }

    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        System.out.println("Processing credit card payment: $" + amount);
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
        // Credit card transaction: 18% GST
        this.tax = amount * 0.18;
        return tax;
    }

    @Override
    public void generateTaxvoic() {
        System.out.println("Tax Invoice:");
        System.out.println("Transaction: Credit Card");
        System.out.println("Amount: " + amount);
        System.out.println("GST (18%): " + tax);
        System.out.println("Total: " + (amount + tax));
    }

    @Override
    public void logActivity(String action) {
        System.out.println("Activity Logged: " + action);
    }
    public static void main(String[] args) {

    CreditCardPayment payment = new CreditCardPayment("1234-5678-9012-3456");

    payment.processPayment(1000);

    System.out.println("Payment Status: " + payment.getPaymentStatus());

    payment.calculateTax();

    payment.generateTaxvoic();

    payment.refundPayment(1000);

    System.out.println("Payment Status: " + payment.getPaymentStatus());
}
}