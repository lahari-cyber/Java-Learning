interface Payable{
    void processPayment(double amount);
    String getPaymentStatus();
    void refundPayment(double amount);
    
}
interface Taxable{
    double calculateTax();
    void generateTaxvoic();
}
interface Loggable{
    void logActivity(String action);
    
}