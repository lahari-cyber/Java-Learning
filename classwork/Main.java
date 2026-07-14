class Main {
    public static void main(String args[]){
    try{
        int quantity = Integer.parseInt("abc");
        double price = 100.0;
        double total = quantity * price;
        System.out.println("Total: " + total);
    }
    catch (NumberFormatException e){
        System.out.println("Invalid quantity entered, please enter a valid number");
        System.out.println("Using default quantity");
        double total = 100.0;
        System.out.println("Total: " + total);
    }
    System.out.println("Checkout comeback successfully");
    }
}