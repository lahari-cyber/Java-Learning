import java.util.Date;

// Parent Class- attributes: orderid, totalamount, orderdate
class Order {
    protected String orderId;
    protected double totalAmount;
    protected String orderDate;

    // Parent Constructor- instance variables: orderid, totalamount, orderdate
    public Order(String orderId, double totalAmount) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.orderDate = new Date().toString();
        System.out.println("Order created: " + orderId);
    }

    // Parent Method
    public double calculateDiscount() {
        // Base discount: 5%
        return totalAmount * 0.05;
    }

    public void displayOrder() {
        System.out.println("Order ID : " + orderId);
        System.out.println("Amount   : $" + totalAmount);
        System.out.println("Date     : " + orderDate);
    }
}

// Child Class
class PremiumOrder extends Order { //every premiumorder is a order
    private String membershipTier;
    private double cashback;

    // Child Constructor
    public PremiumOrder(String orderId, double totalAmount, String membershipTier) {
        super(orderId, totalAmount);
        this.membershipTier = membershipTier;
        this.cashback= totalAmount*0.10;
        System.out.println("cashback " + cashback + " ---");
        System.out.println("Premium order with " + membershipTier +"membership");
    }    

    //overriding with super to reuse parent logic
    @Override
    public double calculateDiscount(){
        //get parent's discount (5%) and add premium discount (10%)
        double baseDiscount = super.calculateDiscount(); //calling parent method
        double premiumDiscount =totalAmount * 0.10;
        double finalDiscount = baseDiscount + premiumDiscount;
        System.out.println("Premium discount applied " + finalDiscount);
        return finalDiscount;
    }

    @Override
    public void displayOrder(){
        super.displayOrder(); //call parent's display
        System.out.println("Membership: "+ membershipTier);
        System.out.println("cashback: " + cashback);

    }


}    
//usage:
public class EcommerceApp{
    public static void main(String args[]){
        PremiumOrder order = new PremiumOrder( "ORD123", 5000, "Gold");
        order.displayOrder();
        order.calculateDiscount();
    }
    
}
//Parent Class - Order
//Child Class - PremiumOrder
//Inheritance - PremiumOrder extends Order
//Parent Constructor(same class name to identify constructor) - Order()
//Child Constructor - PremiumOrder()
//super() - Calls parent constructor inside the child constructor and should be in 1st line
//super.calculateDiscount() - Calls parent calculateDiscount() method
//super.displayOrder() - Calls parent displayOrder() method
//Method Overriding - calculateDiscount() and displayOrder()
//Object - PremiumOrder order = new PremiumOrder("ORD123", 5000, "Gold");

//important rules:
//1. `super()` must be the first statement in a child class constructor.
//2. if you don't call `super()`, java automatically inserts `super()` (default constructor).
//3. if the parent doesn't have a default constructor, you must explicity call `super(parameters)`.


